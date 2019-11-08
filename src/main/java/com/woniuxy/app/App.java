package com.woniuxy.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "com.woniuxy")
@MapperScan("com.woniuxy.dao")
//@EnableTransactionManagement
public class App { 
	public static void main(String[] args) {  
		SpringApplication.run(App.class, args);            
	}        
}  