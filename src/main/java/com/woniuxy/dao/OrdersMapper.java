package com.woniuxy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.woniuxy.domain.Orders;
import com.woniuxy.domain.OrdersExample;

public interface OrdersMapper {
	long countByExample(OrdersExample example);

	int deleteByExample(OrdersExample example);

	int deleteByPrimaryKey(String oid);

	int insert(Orders record);

	int insertSelective(Orders record);

	List<Orders> selectByExample(OrdersExample example);

	Orders selectByPrimaryKey(String oid);

	int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

	int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

	int updateByPrimaryKeySelective(Orders record);

	int updateByPrimaryKey(Orders record);

	List<Orders> findByStartTime(String date,String tid);
	Double findAllMoney(String date,String tid);
	List<Orders> findByTid(String tid);
}