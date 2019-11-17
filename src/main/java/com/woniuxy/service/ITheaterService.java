package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Theater;
import com.woniuxy.domain.Users;


public interface ITheaterService {
	public void save(Theater theater);
	public void delete(String tid);
	public void update(Theater theater);
	public Theater findOneByTname(String theaterName);
	public List<Theater> findAll();
}
