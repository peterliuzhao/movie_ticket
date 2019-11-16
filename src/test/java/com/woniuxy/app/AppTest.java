package com.woniuxy.app;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.woniuxy.dao.OrdersMapper;
import com.woniuxy.domain.Orders;
import com.woniuxy.domain.Users;
import com.woniuxy.service.IUserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {App.class})
//@SpringBootTest
public class AppTest {
	
	@Autowired
	private OrdersMapper ordersMapper;

	@Resource
	private IUserService userServiceImpl;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testUserFindOneByUnameWithThearterId() {
		Users user = new Users();
		user.setTid("2");
		user.setUname("t2");
		System.out.println(userServiceImpl.findOneByUname(user));
	}
	
	//logging:
//	  level: 
//		  com:
//		  woniu: debug
	@Test
	public void testName() throws Exception {//#{tid}
		List<Orders> findByTid = ordersMapper.findByTid("1", new RowBounds(0,5));
		System.out.println(findByTid);
		
//		System.out.println(ordersMapper.selectByExample(null,new RowBounds(0,5)));
//		System.out.println(ordersMapper.findTenMoney("1"));
	}

}
