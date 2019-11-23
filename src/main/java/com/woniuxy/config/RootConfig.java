package com.woniuxy.config;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.sql.DataSource;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.realm.jdbc.JdbcRealm.SaltStyle;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import com.alibaba.druid.pool.DruidDataSource;

import net.sf.ehcache.CacheManager;

import org.apache.shiro.web.filter.authc.UserFilter;

/*
 在SpringBoot环境中，在启动类上，添加了@SpringBootApplication(scanBasePackages = "com.woniuxy")
 这样，就会在启动SpringBoot内置的tomcat时，创建spring ioc容器，容器就会扫描com.woniuxy
 就能扫到RootConfig， 发现该类上有个@Configuration， spring ioc容器就会利用反射机制，把所有有@Bean的方法
 的名字反射出来，多为bean的id， 把有@Bean的方法执行以后得到返回值，作为对象，存入容器中！
*/
@Configuration
public class RootConfig {

	//websocket所需要的类
	@Bean
	public ServerEndpointExporter serEndExp() {
		return new ServerEndpointExporter();
	}
	  
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		return new CommonsMultipartResolver();
	}
	
	@Bean
	public DataSource ds() {
		DruidDataSource ds = new DruidDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://39.96.73.68:3306/movie_ticket?characterEncoding=utf8");
		ds.setUsername("root");
		ds.setPassword("Ljq5458674!");
		return ds;
	}
	
	@Bean
	public HashedCredentialsMatcher hcm() {
		HashedCredentialsMatcher hcm = new HashedCredentialsMatcher();
		hcm.setHashAlgorithmName("md5");
		hcm.setHashIterations(1024);
		return hcm;
	}
	
	
	@Bean
	public EhCacheManager cacheManager() {
		//如果使用的ehcache版本超过了2.5.0，那么<ehcache name="myEhcache">就很重要，
		//不然ehcache会自动加载为默认的名字_default_,而ehcache2.5以后只允许创建单例的CacheManager，
		//从而报重复加载CacheManager的错误。
		
		
		//注意myEhcache对应配置文件的<ehcache name="myEhcache">
        CacheManager cacheManager = CacheManager.getCacheManager("myEhcache");
        if(cacheManager == null){
            cacheManager = CacheManager.create();
        }
        EhCacheManager ehCacheManager = new EhCacheManager();
        ehCacheManager.setCacheManager(cacheManager);
        ehCacheManager.setCacheManagerConfigFile("classpath:shiro-ehcache.xml");
        return ehCacheManager;
		
//		EhCacheManager ecm = new EhCacheManager();
//		ecm.setCacheManagerConfigFile("classpath:shiro-ehcache.xml");
//		return ecm;
	}  
	
	@Bean
	public JdbcRealm realm() {
		//使用定制版的realm  select upwd, salt from users where uname = ? and tid = ?
		//默认tid为
		MyJdbcRealm realm = new MyJdbcRealm();
		realm.setDataSource(ds());
		realm.setAuthenticationQuery("select upwd, salt from users where uname = ? and tid = ?");
		realm.setUserRolesQuery("select rname from users_roles ur join users u on ur.uid = u.uid join roles r on ur.rid = r.rid where uname = ?");
		realm.setPermissionsQuery("select pname from roles_permissions rp join roles r on rp.rid = r.rid join permissions p on rp.pid = p.pid where rname = ?");
		realm.setPermissionsLookupEnabled(true);
		realm.setCredentialsMatcher(hcm());
		realm.setSaltStyle(SaltStyle.COLUMN);
		realm.setCachingEnabled(true);
		return realm;
		
		
		
//==================================================================================================
//		JdbcRealm realm = new JdbcRealm();
//		realm.setDataSource(ds());
//		realm.setAuthenticationQuery("select upwd, salt from users where uname = ?");
//		realm.setUserRolesQuery("select rname from users_roles ur join users u on ur.uid = u.uid join roles r on ur.rid = r.rid where uname = ?");
//		realm.setPermissionsQuery("select pname from roles_permissions rp join roles r on rp.rid = r.rid join permissions p on rp.pid = p.pid where rname = ?");
//		realm.setPermissionsLookupEnabled(true);
//		realm.setCredentialsMatcher(hcm());
//		realm.setSaltStyle(SaltStyle.COLUMN);
//		return realm;
	}
	
	@Bean
	public DefaultWebSecurityManager securityManager() {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(realm());
		securityManager.setCacheManager(cacheManager());
		return securityManager;
	}
	
	//在springboot环境中，需要按照以下配置，让shiro注解生效
	@Bean
	public AuthorizationAttributeSourceAdvisor getAuthorizationAttributeSourceAdvisor() {
		AuthorizationAttributeSourceAdvisor aasa = new AuthorizationAttributeSourceAdvisor();
		aasa.setSecurityManager(securityManager());
		return aasa;
	}
		
	@Bean
	public ShiroFilterFactoryBean shiroFilter() {
		ShiroFilterFactoryBean sf = new ShiroFilterFactoryBean();
		sf.setSecurityManager(securityManager());
		Map<String, String> map = new HashMap<>();
		
		map.put("/users/login","anon");
		map.put("/users/isAuthenticated","anon");
		map.put("/users/logout", "anon");
		map.put("/users/save", "anon");
		map.put("/ordernotification", "anon");
		map.put("/images/**", "anon");
		map.put("/reviews/findAll", "anon");
		map.put("/**", "authc");
//		map.put("/**", "anon");
		   
//		sf.setLoginUrl("/index.jsp");
//		sf.setUnauthorizedUrl("/unauthorized.jsp");

		
//		// 自定义shiro过滤器的配置
//        Map<String, Filter> filter = new HashMap<>();
//        filter.put("custom", new ShiroUserFilter());
//        sf.setFilters(filter);
//        map.put("/**","custom");
            
//		map.put("/index.jsp", "anon");
//		map.put("/users/login", "anon");   
//		map.put("/logout", "logout");
//		map.put("/users.jsp", "roles[admin]");
//		map.put("/cars.jsp", "roles[guest]");
        
//		map.put("/**", "anon");//"authc");
		sf.setFilterChainDefinitionMap(map);
		return sf;
	}
	
	
	
}
