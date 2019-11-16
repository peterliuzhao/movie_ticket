package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Users;


public interface IUserService {
	public void save(Users u);
	public void delete(String uid);
	public void update(Users u);
	public Users findOne(String uid);
	public List<Users> findAll();
	public Users findOneByUname(Users user);
}
