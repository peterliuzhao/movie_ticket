package com.woniuxy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniuxy.domain.Coupon;
import com.woniuxy.service.ICouponService;

@Controller
@RequestMapping("coupons")
public class CouponController {

	@Autowired
	private ICouponService service;
	
	@PostMapping
	public void save(@RequestBody Coupon coupon) {
		service.save(coupon);
	}
	
	@DeleteMapping
	public void delete(String cpid) {
		service.delete(cpid);
	}
	
	@PutMapping
	public void update(Coupon coupon) {
		service.update(coupon);
	}
	
	@GetMapping("/cpid")
	public Coupon findOne(String cpid) {
		return service.findOne(cpid);
	}
	
	@GetMapping
	public List<Coupon> findAll() {
		return service.findAll();
	}
}
