package com.woniuxy.web.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ContextLoader;

import com.woniuxy.config.MyUsernamePasswordTidToken;
import com.woniuxy.domain.Theater;
import com.woniuxy.domain.Users;
import com.woniuxy.service.ITheaterService;
import com.woniuxy.service.IUserService;
import com.woniuxy.util.AccountUtils;

@Controller
@RequestMapping("users")
public class UserController {

	@Autowired
	private IUserService service;
	
	@Autowired
	private ITheaterService theaterService;
	
	//shiro 注册 用户增加加密
	@GetMapping("save")
	@ResponseBody
	public Map<String, Object> save(Users user) {
		System.out.println(user);
		Map<String, Object> map = new HashMap<>();
		if (user.getUname()!=null&&user.getUpwd()!=null) {
			try {
				service.save(user);
				map.put("status", 200);
				map.put("message", "注册成功");
			} catch (Exception e) {
				e.printStackTrace();
				map.put("status", 500);
				map.put("message", "注册失败，可能是用户名已存在");
			}
		}else {
			map.put("status", 500);
			map.put("message", "注册失败，参数非法");
		}
		return map;
	}

	//登录过程 成功返回200 失败返回500

	@GetMapping("login")
	@ResponseBody
	public Map<String, Object> login(Users user,@RequestParam(required=false) String theaterName,HttpServletRequest req) {
		Theater thearter = theaterService.findOneByTname(theaterName);
		System.out.println(thearter+" =============");
		String username = user.getUname(); 
		String password = user.getUpwd();
		if(thearter!=null) {
			user.setTid(thearter.getTid());
		}
		//shiro标准jdbc
//		System.out.println(username + password);
//		Subject subject = SecurityUtils.getSubject();
//		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		
		
		//定制版jdbcrealm
		Subject subject = SecurityUtils.getSubject();
		MyUsernamePasswordTidToken token = new MyUsernamePasswordTidToken(username, password,thearter.getTid());
		Map<String, Object> map = new HashMap<>();
		
		try { 
			
			subject.login(token);  
			map.put("status", 200);
			map.put("username", subject.getPrincipal()); 
			map.put("uid",service.findOneByUname(user).getUid());
			map.put("tid",thearter.getTid());
			
//			System.out.println("map :"+map);
//			System.out.println("user form info: "+user);
//			System.out.println("user database info: "+service.findOneByUname(user));
//			req.getSession().setAttribute("uid", service.findUserByUname(username).getUid().toString());
		} catch (AuthenticationException e) {
//			System.out.println("UserController.login()---------------------------");
			map.put("status", 500);
			map.put("message", "登录失败，可能是用户名或密码错误");
		}
        
		System.out.println(map+" map=============");
		return map;
	}

	// 退出登录 注销功能
	@GetMapping("logout")
	@ResponseBody
	public void logout(HttpServletRequest request, HttpServletResponse response) {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
//		System.out.println("logout!!!!!");
	}
	
	//验证是否登录
	@RequestMapping("isAuthenticated")
	public Map<String,Object> isAutheticated(){
		Subject subject = SecurityUtils.getSubject();
		HashMap<String, Object> loginMap = new HashMap<>();
		loginMap.put("isAuthenticated", subject.isAuthenticated());
		return loginMap;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	@RequestMapping("/login")
//	@ResponseBody
//	public String login(String username,String password) {
//		Subject subject = SecurityUtils.getSubject();
//		
//		UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);
//		try {
//			subject.login(usernamePasswordToken);
//			System.out.println("认证成功");
//			return "home";
//		} catch (AuthenticationException e) {
//			e.printStackTrace();
//			System.out.println("认证失败！！！！！"+e);
//			return "error";
//		}
//	}
//	
//	   
////	@RequiresRoles(value = {"admin","guest"},logical = Logical.OR)
//	@RequestMapping("/save")     
//	public ModelAndView save(Users u) { 
//		//生成数据库用户UUID Id主键
//		UUID randomUUID_UserId = UUID.randomUUID();
//		u.setUid(randomUUID_UserId.toString());
//		u.setSalt("abc");
//		SimpleHash simpleHash = new SimpleHash("md5",u.getUpwd(),"abc",1024);
//		u.setUpwd(simpleHash.toHex().toString());
//		service.save(u); 
//		
//		
//		
//		
//		
//		List<Users> list = service.findAll();
//		ModelAndView modelAndView = new ModelAndView("listuser");
//		modelAndView.addObject(list);
//		return modelAndView;
//	}
//	
//	
//	@RequiresRoles("admin")      
//	@RequestMapping("/delete")
//	@ResponseBody  
//	public void delete() {
//		System.out.println("UserController.delete()--------------------");  
//	}
//	
//
//	
//	
//	@RequestMapping("/list")
//	public ModelAndView list() {   
//		List<Users> list = service.findAll();
//		ModelAndView modelAndView = new ModelAndView("listuser");
//		modelAndView.addObject(list);
//		return modelAndView;   
//	}
//	
//	
//	
//	
//	@RequiresAuthentication
//	@RequestMapping("f3")
//	@ResponseBody
//	public void f3(Users u) {
//		System.out.println("UserController.f3()");
//		service.delete(u.getUid());
//	}
//	
//	
//	
//	@RequestMapping("/upload")
//	public void upload(@RequestParam CommonsMultipartFile photo) {
//		System.out.println(photo);
//	}
//	
}
