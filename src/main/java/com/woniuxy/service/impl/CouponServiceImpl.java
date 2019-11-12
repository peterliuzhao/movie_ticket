package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.CouponMapper;
import com.woniuxy.domain.Coupon;
import com.woniuxy.service.ICouponService;

@Service
public class CouponServiceImpl implements ICouponService{

	@Autowired
	private CouponMapper mapper;
	
	@Transactional
	@Override
	public void save(Coupon coupon) {
		mapper.insertSelective(coupon);
	}

	@Transactional
	@Override
	public void delete(String cpid) {
		mapper.deleteByPrimaryKey(cpid);
	}

	@Transactional
	@Override
	public void update(Coupon coupon) {
		mapper.updateByPrimaryKeySelective(coupon);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Coupon findOne(String cpid) {
		return mapper.selectByPrimaryKey(cpid);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Coupon> findAll() {
		return mapper.selectByExample(null);
	}
}
