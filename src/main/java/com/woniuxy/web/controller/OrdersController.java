package com.woniuxy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.domain.Orders;
import com.woniuxy.service.IOrdersService;
import com.woniuxy.util.page.Page;

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
	
	
	@PostMapping
	public void save(@RequestBody Orders order) {
		service.save(order);
	}
	
	@PutMapping
	public void update(@RequestBody Orders order) {
		service.update(order);
	}
	
	
}
