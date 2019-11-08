package com.woniuxy.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration
public class AppConfig implements WebMvcConfigurer {
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(new CORSInterceptor()).addPathPatterns("/**");
//	}
//
//	@Override
//	public void addCorsMappings(CorsRegistry registry) {
//		registry.addMapping("/**")
//        .allowedOrigins("*")
//        .allowedMethods("POST","GET","PUT","DELETE", "OPTIONS")
//        .allowedHeaders("*")
//        .allowCredentials(true);  // 允许客户端ajax请求携带cookie;
//	}

}
   