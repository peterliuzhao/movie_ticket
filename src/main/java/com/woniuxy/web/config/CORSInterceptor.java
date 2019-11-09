package com.woniuxy.web.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

//public class CORSInterceptor implements HandlerInterceptor{
//	
//	@Override  
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//			throws Exception {
//		System.out.println("CORSInterceptor.preHandle() !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//		response.setHeader("Access-Control-Allow-Origin", "*");
//		response.setHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,OPTIONS");
//		response.setHeader("Access-Control-Allow-Headers", "Content-Type,Accept");
//		return true;
//	}
//
//	
//}
