package com.woniuxy.web.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.domain.Customer;
import com.woniuxy.service.ICustomerService;

@RestController
@RequestMapping("customers")
public class CustomerController {

	@Autowired
	private ICustomerService service;
	
	@GetMapping(value = "fbt")
	public List<Customer> findByTid(String tid){
		List<Customer> list = service.findByTid(tid);
		return list;
	}
	
	@PostMapping
	public void save(Customer cus) {
		//service.save(cus);
		System.out.println(cus);
	}
	
	@PutMapping
	public void update(Customer cus) {
		service.update(cus);
	}
	
	@DeleteMapping("{cid}")
	public void delete(@PathVariable String cid) {
		//service.delete(cid);
		System.out.println(cid);
	}
}
