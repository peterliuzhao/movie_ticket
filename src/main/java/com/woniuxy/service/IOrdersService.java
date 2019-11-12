package com.woniuxy.service;

import java.util.List;
import java.util.Map;

import com.woniuxy.domain.Orders;

public interface IOrdersService {
	void save(Orders order);

	void delete(String oid);

	void update(Orders order);

	Orders findOne(String oid);

	List<Orders> findAll(String tid);

	List<Orders> findByStartTime(String date, String tid);

	List<Orders>  findTenMoney(String tid);

	 Orders findDayMoney(String date, String tid);
}
