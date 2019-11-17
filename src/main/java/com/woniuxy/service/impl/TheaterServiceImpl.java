package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.TheaterMapper;
import com.woniuxy.dao.UsersMapper;
import com.woniuxy.domain.Theater;
import com.woniuxy.domain.Users;
import com.woniuxy.service.ITheaterService;
import com.woniuxy.service.IUserService;
import com.woniuxy.util.AccountUtils;


@Service
public class TheaterServiceImpl implements ITheaterService{
	
	@Autowired
	private TheaterMapper mapper;

	@Override
	public void save(Theater theater) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Theater theater) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Theater findOneByTname(String tname) {
		return mapper.findOneByTname(tname);
	}

	@Override
	public void delete(String tid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Theater> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
