package com.woniuxy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.domain.Orders;
import com.woniuxy.service.IOrdersService;

@RestController
@RequestMapping("orders")
public class OrdersController {
     
	@Autowired
	private IOrdersService service;
	
	
	
	@GetMapping
	public List<Orders> findAll(@RequestBody String tid){
		return service.findAll(tid);
		
	}
	@GetMapping("{date}")
	public List<Orders> findByStartTime(@PathVariable @RequestBody String date,@RequestBody String tid){
		
		return service.findByStartTime(date,tid);	
	}
	
	@GetMapping("/money")
	public Double findAllMoney(@RequestBody String date,@RequestBody String tid) {
		
		return service.findAllMoney(date, tid);
		
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
