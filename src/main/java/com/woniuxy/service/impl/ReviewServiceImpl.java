package com.woniuxy.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.ReviewMapper;
import com.woniuxy.domain.Review;
import com.woniuxy.service.IReviewService;
import com.woniuxy.util.AccountUtils;

@Service
public class ReviewServiceImpl implements IReviewService {

	@Autowired
	private ReviewMapper mapper;
	
	@Transactional
	@Override
	public void save(Review review) {
		review.setRwid(AccountUtils.uuid());
		review.setUid("6fa1b7bf917e4fec8871e0860b89e6ae");
		mapper.insertSelective(review);
	}

	@Transactional
	@Override
	public void delete(String rwid) {
		mapper.deleteByPrimaryKey(rwid);
	}

	@Transactional
	@Override
	public void update(Review review) {
		mapper.updateByPrimaryKeySelective(review);
	}

	@Transactional(readOnly = true)
	@Override
	public Review findOne(String rwid) {
		return mapper.selectByPrimaryKey(rwid);
	}

	/*
	 * @Transactional(readOnly = true)
	 * 
	 * @Override public List<Map<String,Object>> findAll() { return
	 * mapper.findAll(); }
	 */
	@Transactional(readOnly = true)
	@Override public List<Map<String,Object>> findAll() { 
		return mapper.findAll();
	}
}
