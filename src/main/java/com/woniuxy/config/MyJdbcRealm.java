package com.woniuxy.config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.ConfigurationException;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.util.JdbcUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyJdbcRealm extends JdbcRealm{
	private static final Logger log = LoggerFactory.getLogger(JdbcRealm.class);
	
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

    	MyUsernamePasswordTidToken upToken = (MyUsernamePasswordTidToken) token;
        String username = upToken.getUsername();
        String tid = upToken.getTid();//!!!!MyUserNamePasswordTid传入的影院id;

        // Null username is invalid
        if (username == null) {
            throw new AccountException("Null usernames are not allowed by this realm.");
        }

        Connection conn = null;
        SimpleAuthenticationInfo info = null;
        try {
            conn = dataSource.getConnection();

            String password = null;
            String salt = null;
            switch (saltStyle) {
            case NO_SALT:
                password = getPasswordForUser(conn, username,tid)[0];
                break;
            case CRYPT:
                // TODO: separate password and hash from getPasswordForUser[0]
                throw new ConfigurationException("Not implemented yet");
                //break;
            case COLUMN:
                String[] queryResults = getPasswordForUser(conn, username,tid);
                password = queryResults[0];
                salt = queryResults[1];
                break;
            case EXTERNAL:
                password = getPasswordForUser(conn, username,tid)[0];
                salt = getSaltForUser(username);
            }

            if (password == null) {
                throw new UnknownAccountException("No account found for user [" + username + "]");
            }

            info = new SimpleAuthenticationInfo(username, password.toCharArray(), getName());
            
            if (salt != null) {
                info.setCredentialsSalt(ByteSource.Util.bytes(salt));
            }

        } catch (SQLException e) {
            final String message = "There was a SQL error while authenticating user [" + username + "]";
            if (log.isErrorEnabled()) {
                log.error(message, e);
            }

            // Rethrow any SQL errors as an authentication exception
            throw new AuthenticationException(message, e);
        } finally {
            JdbcUtils.closeConnection(conn);
        }

        return info;
    }

    private String[] getPasswordForUser(Connection conn, String username,String tid) throws SQLException {

        String[] result;
        boolean returningSeparatedSalt = false;
        switch (saltStyle) {
        case NO_SALT:
        case CRYPT:
        case EXTERNAL:
            result = new String[1];
            break;
        default:
            result = new String[2];
            returningSeparatedSalt = true;
        }
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(authenticationQuery);
            ps.setString(1, username);
            ps.setString(2, tid);

            // Execute query
            rs = ps.executeQuery();

            // Loop over results - although we are only expecting one result, since usernames should be unique
            boolean foundResult = false;
            while (rs.next()) {

                // Check to ensure only one row is processed
                if (foundResult) {
                    throw new AuthenticationException("More than one user row found for user [" + username + "]. Usernames must be unique.");
                }

                result[0] = rs.getString(1);
                if (returningSeparatedSalt) {
                    result[1] = rs.getString(2);
                }

                foundResult = true;
            }
        } finally {
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closeStatement(ps);
        }

        return result;
    }
    
    
}
