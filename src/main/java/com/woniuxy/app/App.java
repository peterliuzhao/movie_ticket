package com.woniuxy.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.woniuxy.web.websocket.OrderNotificationSocket;

@SpringBootApplication(scanBasePackages = "com.woniuxy")
@MapperScan("com.woniuxy.dao")
//@EnableTransactionManagement 测试子分支
public class App { 
	public static void main(String[] args) {  
		ConfigurableApplicationContext run = SpringApplication.run(App.class, args);
//		OrderNotificationSocket.setApplicationContext(run);
	}         
}                