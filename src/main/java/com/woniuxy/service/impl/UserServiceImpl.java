package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.UsersMapper;
import com.woniuxy.domain.Users;
import com.woniuxy.service.IUserService;


@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UsersMapper mapper;

	@Transactional     
	@Override
	public void save(Users u) {
		mapper.insertSelective(u);
	}

	@Transactional       
	@Override  
	public void delete(String uid) {
		mapper.deleteByPrimaryKey(uid);
	}

	@Transactional
	@Override
	public void update(Users u) {
		mapper.updateByPrimaryKeySelective(u);
	}

	@Transactional(readOnly = true)
	@Override
	public Users findOne(String uid) {
		return mapper.selectByPrimaryKey(uid);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Users> findAll() {
		return mapper.selectByExample(null);
	}
	
}
