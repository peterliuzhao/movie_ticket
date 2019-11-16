package com.woniuxy.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.OrdersMapper;
import com.woniuxy.domain.Orders;
import com.woniuxy.service.IOrdersService;
import com.woniuxy.util.page.Page;

@Service
public class OrdersServiceImpl implements IOrdersService {
	@Autowired
	private OrdersMapper mapper;

	@Transactional
	@Override
	public void save(Orders order) {
		mapper.insertSelective(order);

	}

	@Transactional
	@Override
	public void delete(String oid) {
		mapper.deleteByPrimaryKey(oid);

	}

	@Transactional
	@Override
	public void update(Orders order) {
		mapper.updateByPrimaryKeySelective(order);

	}

	@Transactional(readOnly = true)
	@Override
	public Orders findOne(String oid) {

		return mapper.selectByPrimaryKey(oid);
	}

	@Transactional(readOnly = true)
	@Override
	public Page<Orders> findAll(String tid,Integer currentPage) {
		//分页
		int rowPerPage = 6;
		
		int count=mapper.selectByExample(null).size();
		Page<Orders> page=new Page<Orders>(currentPage,count,rowPerPage);

		List<Orders> orders=mapper.findByTid(tid,new RowBounds((page.getP()-1)*rowPerPage,rowPerPage));
		page.setList(orders);

		return page;
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Orders> findByStartTime(String date,String tid) {
		
		return mapper.findByStartTime(date,tid);
	}

	
	@Transactional(readOnly = true)
	@Override
	public Orders findDayMoney(String date, String tid) {
		
		return mapper.findDayMoney(date, tid);
	}

	@Override
	public List<Orders> findTenMoney(String tid) {
		List<Orders> allMoney = mapper.findTenMoney(tid);
		return allMoney;
	}

}
