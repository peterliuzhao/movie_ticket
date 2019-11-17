package com.woniuxy.web.websocket;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.woniuxy.util.SpringBeanTool;
import org.springframework.web.socket.server.standard.SpringConfigurator;

@ServerEndpoint(value = "/ordernotification")
@Component
public class OrderNotificationSocket {
	
		@Autowired
		private SpringBeanTool springBeanTool; 
		
//		@Resource
//		private ServletContext servletContext;
//		
//		private static ApplicationContext applicationContext;
		private static ServletContext servletContext;
		
	    public OrderNotificationSocket() {
	    	System.out.println("OrderNotificationSocket()---------初始化");
//	    	System.out.println("springBeanTool++++"+springBeanTool);   
	    	
		}  

//	    public static void setApplicationContext(ApplicationContext applicationContext) {
//	    	OrderNotificationSocket.applicationContext = applicationContext;
//	    }

	    
		public static ServletContext getServletContext() {
			return servletContext;
		}

		public static void setServletContext(ServletContext servletContext) {
			OrderNotificationSocket.servletContext = servletContext;
		}

		@OnOpen  
		public void open(Session session) {
			System.out.println("open()---------open");
		}   
		
		@OnMessage
		public void msg(String tid,Session session) {//tid 1   
//			System.out.println("applicationContext.msg()   "+servletContext);
			Map<String,Session> websocketSessionMap;
			
			
			System.out.println("servletContext.getAttribute(\"OrderNotificationSocket\")"+servletContext.getAttribute("OrderNotificationSocket"));
			if(servletContext.getAttribute("OrderNotificationSocket")==null) {
				websocketSessionMap = new HashMap<String,Session>();
			}
			else {
				websocketSessionMap = (Map<String, Session>) servletContext.getAttribute("OrderNotificationSocket");
			}
			
			System.out.println("tid+++++"+tid);
//			System.out.println(session.getBasicRemote().toString()+"     ");
			websocketSessionMap.put(tid, session);  
			servletContext.setAttribute("OrderNotificationSocket", websocketSessionMap); 
			    
			System.out.println(this+"--this");
			
			
			      
			
			
//			ServletContext servletContext = //
////					ContextLoader.getCurrentWebApplicationContext().getServletContext();
//			System.out.println("OrderNotificationSocket.msg()");
//			System.out.println("getApplicationContext"+springBeanTool+"+-===========");
//			System.out.println("OrderNotificationSocket.msg()"+tid);
//			servletContext.setAttribute(tid, this);
		}
		    
		@OnClose
		public void close() {
			System.out.println("close()--------------close");
		}  
}    
