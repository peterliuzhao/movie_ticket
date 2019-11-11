package com.woniuxy.dao;

import java.util.List;
import java.util.Map;

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

	List<Orders> findByStartTime(@Param("date") String date,@Param("tid")  String tid);
	Orders findDayMoney(@Param("date") String date,@Param("tid")  String tid);
	List<Orders> findAllMoney(@Param("tid")  String tid);
	List<Orders> findByTid(@Param("tid") String tid);
}