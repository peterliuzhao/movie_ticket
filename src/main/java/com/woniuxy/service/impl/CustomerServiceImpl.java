package com.woniuxy.service.impl;


import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.CustomerMapper;
import com.woniuxy.domain.Customer;
import com.woniuxy.service.ICustomerService;
import com.woniuxy.util.AccountUtils;
@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerMapper mapper;
	
	@Transactional(readOnly = true)
	@Override
	public List<Customer> findByTid(String tid) {
		List<Customer> list = mapper.findByTid(tid);
		Collections.reverse(list);
		return list;
	}
	
	@Transactional
	@Override
	public void save(Customer cus) {
		// TODO Auto-generated method stub
		cus.setCid(AccountUtils.uuid());
		mapper.insertSelective(cus);
	}
	
	@Transactional
	@Override
	public void delete(String cid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(cid);
	}
	
	@Transactional
	@Override
	public void update(Customer cus) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKey(cus);
	}

}
