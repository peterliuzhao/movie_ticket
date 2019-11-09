package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.TcomboMapper;
import com.woniuxy.dao.UsersMapper;
import com.woniuxy.domain.Tcombo;
import com.woniuxy.domain.Users;
import com.woniuxy.service.ITcomboService;
import com.woniuxy.service.IUserService;


@Service
public class TcomboServiceImpl implements ITcomboService{
	
	@Autowired
	private TcomboMapper mapper;

	@Transactional     
	@Override
	public void save(Tcombo tc) {
		mapper.insertSelective(tc);
	}

	@Transactional       
	@Override  
	public void delete(String tcId) {
		mapper.deleteByPrimaryKey(tcId);
	}

	@Transactional
	@Override
	public void update(Tcombo tc) {
		mapper.updateByPrimaryKeySelective(tc);
	}

	@Transactional(readOnly = true)
	@Override
	public Tcombo findOne(String tcId) {
		return mapper.selectByPrimaryKey(tcId);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Tcombo> findAll() {
		return mapper.selectByExample(null);
	}

	@Override
	public List<Tcombo> findTheaterComboOrdersByUserName(String tname) {
		return mapper.findTheaterComboOrdersByUserName(tname);
	}
	
}
