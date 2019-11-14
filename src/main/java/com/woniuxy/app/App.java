package com.woniuxy.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "com.woniuxy")
@MapperScan("com.woniuxy.dao")
//@EnableTransactionManagement 测试子分支
public class App { 
	public static void main(String[] args) {  
<<<<<<< HEAD
		SpringApplication.run(App.class, args);     
=======
		SpringApplication.run(App.class, args);      
		
		
		
>>>>>>> branch 'dev' of git@github.com:peterliuzhao/movie_ticket.git
	}        
}           