package com.woniuxy.web.controller;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.domain.Customer;
import com.woniuxy.domain.Users;
import com.woniuxy.service.ICustomerService;
import com.woniuxy.service.IUserService;
import com.woniuxy.util.AccountUtils;

@RestController
@RequestMapping("customers")
public class CustomerController {

	@Autowired
	private ICustomerService service;
	@Autowired
	private IUserService uservice;
	
	@GetMapping(value = "fbt")
	public List<Customer> findByTid(String tid){
		List<Customer> list = service.findByTid(tid);
		return list;
	}
	
	@GetMapping
	public List<Customer> findOne(String field,String content,String tid) {
		content="\\w*"+content+"\\w*@*\\w*\\.*\\w*";
		System.out.println("CustomerController.findOne()"+content+"~~~~~~");
		List<Customer>target = service.findOne(field,content,tid);
		System.out.println("CustomerController.findOne()"+target.get(0).getCphone()+"!!!!!!!");
		return target;
	}
	
	@PostMapping
	public void save(@RequestBody Users user) {
		uservice.save(user);
		Customer cus=new Customer();
		cus.setCid(AccountUtils.uuid());
		cus.setCname(user.getUname());
		cus.setUid(user.getUid());
		cus.setTid(user.getTid());
		service.save(cus);
	}
	
	@PutMapping
	public void update(@RequestBody Customer cus) {
		service.update(cus);
	}
	
	@DeleteMapping("{cid}")
	public void delete(@PathVariable String cid) {
		service.delete(cid);
		System.out.println("CustomerController.delete()~~~"+cid);
	}
}
