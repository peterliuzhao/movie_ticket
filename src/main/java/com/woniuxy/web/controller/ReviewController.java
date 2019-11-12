package com.woniuxy.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.domain.Review;
import com.woniuxy.service.IReviewService;

@RestController
@RequestMapping("reviews")
public class ReviewController {


	@Autowired
	private IReviewService service;	
	
	@PostMapping
	public void save(@RequestBody Review review) {
		service.save(review);
	}
	
	
	@DeleteMapping("{rwid}") 
	public void delete(@PathVariable String rwid) {
		service.delete(rwid); 
	}
	
	@PutMapping
	public void update(Review review) {
		service.update(review);
	}
	
	@GetMapping("/rwid")
	public Review findOne(String rwid) {
		return service.findOne(rwid);
	}
	
	@GetMapping
	public List<Map<String,Object>> findAll(){
		return service.findAll();
	}
}
