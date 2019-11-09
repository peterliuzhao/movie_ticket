package com.woniuxy.config;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter;
import org.springframework.web.bind.annotation.RequestMethod;

public class ShiroUserFilter extends BasicHttpAuthenticationFilter{
	
	
	 protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
	        HttpServletResponse httpResponse = (HttpServletResponse) response;
	        HttpServletRequest httpRequest = (HttpServletRequest) request;
	      //无条件放行OPTIONS
	        if (httpRequest.getMethod().equals(RequestMethod.OPTIONS.name())) {
	            setHeader(httpRequest, httpResponse);
	            return true;
	        }
	        return true;
	    }


	private void setHeader(HttpServletRequest request,HttpServletResponse response){
        //跨域的header设置  
		System.out.println("ShiroUserFilter.setHeader()");  
        response.setHeader("Access-control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers", "*");
//        response.setHeader("Access-Control-Allow-Headers", request.getHeader("Access-Control-Request-Headers"));
//        //防止乱码，适用于传输JSON数据
//        response.setHeader("Content-Type","application/json;charset=UTF-8");
//        response.setStatus(HttpStatus.OK.value());
    }
}
