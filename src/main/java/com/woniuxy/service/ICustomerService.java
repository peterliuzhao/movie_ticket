package com.woniuxy.service;



import java.util.List;

import com.woniuxy.domain.Customer;

public interface ICustomerService {

	void save(Customer cus);
	void delete(String cid);
	void update(Customer cus);
	List<Customer> findByTid(String tid);

	List<Customer> findOne(String field, String content, String tid);
}
