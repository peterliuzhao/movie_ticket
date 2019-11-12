package com.woniuxy.service;

import java.util.List;
import java.util.Map;

import com.woniuxy.domain.Coupon;
import com.woniuxy.domain.Review;

public interface IReviewService {

	public void save(Review review);
	public void delete(String rwid);
	public void update(Review review);
	public Review findOne(String rwid);
	public List<Map<String, Object>> findAll();
}
