package com.woniuxy.web.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.ContextLoader;

import com.woniuxy.domain.Orders;
import com.woniuxy.service.IOrdersService;
import com.woniuxy.util.page.Page;
import com.woniuxy.web.websocket.OrderNotificationSocket;
import javax.websocket.Session;




@RestController
@RequestMapping("orders")
public class OrdersController {
     
	@Autowired
	private IOrdersService service;
	
	
	
	@GetMapping
	public Page<Orders> findAll(String tid,Integer currentPage){
//	   System.out.println(service.findAll(tid)+"================");
//		System.out.println("currentPage:"+currentPage);
		return service.findAll(tid,currentPage);
		
	}
	
	
	
	@GetMapping("/findDay")
	public List<Orders> findByStartTime( String date, String tid){
		System.out.println("OrdersController.findByStartTime()");
		return service.findByStartTime(date,tid);	
	}
	
	@GetMapping("/daymoney")
	public Orders findDayMoney( String date, String tid) {
		Orders order = service.findDayMoney(date, tid);
		if(order==null) {
			order = new Orders();
			order.setSum(0.0);
		}
		return order;	
	}
	
	@GetMapping("/tenmoney")
	public List<Orders> findAllMoney(String tid) {
		
		return service.findTenMoney(tid);	
	}
	
	
	@GetMapping("save")
	public void save(HttpServletRequest sq,String tid) {//@RequestBody Orders order
//		service.save(order);
		
		//顾客下单通知相应的影院，在影院后台管理界面右上角显示新订单提示
//		System.out.println(sq.getSession().getServletContext().getAttribute("OrderNotificationSocketMap")); 
		System.out.println("tid++++++++++"+tid);
		Map OrderNotificationSocketMap = (Map) sq.getSession().getServletContext().getAttribute("OrderNotificationSocketMap");
		System.out.println("tid-----------"+tid);
		try {
			System.out.println("OrderNotificationSocketMap: "+OrderNotificationSocketMap);
			System.out.println("OrderNotificationSocketMap  tid1:"+(OrderNotificationSocket)OrderNotificationSocketMap.get(tid));
			((OrderNotificationSocket)OrderNotificationSocketMap.get(tid)).session.getBasicRemote().sendText("影院"+tid+"有新订单了！！！");
//			System.out.println("adding!!!!!!!!!!!");
		} catch (IOException e) {
			e.printStackTrace();  
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		System.out.println(sq.getSession().getServletContext().getAttribute("OrderNotificationSocket")); 
//		Map websocketSessionMap = (Map) sq.getSession().getServletContext().getAttribute("OrderNotificationSocket");
//		try {
//			System.out.println("websocketSessionMap: "+websocketSessionMap);
//			((Session)websocketSessionMap.get(tid)).getBasicRemote().sendText("adding!!!!!!!!!!!"+tid);
//			System.out.println("adding!!!!!!!!!!!");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	
	@PutMapping
	public void update(@RequestBody Orders order) {
		service.update(order);
	}
	
	
}
