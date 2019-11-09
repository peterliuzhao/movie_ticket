package com.woniuxy.service;


import java.util.List;

import com.woniuxy.domain.Customer;
import com.woniuxy.domain.Tcombo;
import com.woniuxy.domain.Users;

public interface ITcomboService {
	public void save(Tcombo tc);
	public void delete(String tcId);
	public void update(Tcombo tc);
	public Tcombo findOne(String tcId);
	public List<Tcombo> findAll();
	List<Tcombo> findTheaterComboOrdersByUserName(String uname);
}
