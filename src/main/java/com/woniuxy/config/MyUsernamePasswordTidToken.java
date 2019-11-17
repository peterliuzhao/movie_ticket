package com.woniuxy.config;

import org.apache.shiro.authc.UsernamePasswordToken;

public class MyUsernamePasswordTidToken extends UsernamePasswordToken{
	private String tid;
	
	
	public  MyUsernamePasswordTidToken(final String username, final String password,final String tid) {
        super(username, password != null ? password.toCharArray() : null, false, null);
        this.tid = tid;
    }


	public String getTid() {
		return tid;
	}


	public void setTid(String tid) {
		this.tid = tid;
	}
	
	
	
}
