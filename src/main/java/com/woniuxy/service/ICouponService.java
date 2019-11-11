package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Coupon;
import com.woniuxy.domain.Users;

public interface ICouponService {

	public void save(Coupon coupon);
	public void delete(String cpid);
	public void update(Coupon coupon);
	public Coupon findOne(String cpid);
	public List<Coupon> findAll();
}
