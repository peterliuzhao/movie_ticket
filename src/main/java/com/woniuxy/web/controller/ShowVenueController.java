package com.woniuxy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.ShowVenue;
import com.woniuxy.service.IShowVenueService;

@Controller
@RequestMapping("svs")
public class ShowVenueController {

	@Autowired
	private IShowVenueService service;
	
	//增加放映点
	@PostMapping("save")
	@ResponseBody
	public void save(@RequestBody ShowVenue sv) {
		System.out.println("加了一个~~~~~~"+sv.getSvaddress());
		service.save(sv);
	}
	//删除放映点
	@DeleteMapping("delete/{svid}")
	@ResponseBody
	public void delete(@PathVariable String  svid) {
		System.out.println("删了一个,id为"+svid);
		service.delete(svid);
	}
	//修改放映点信息
	@PutMapping("update")
	@ResponseBody
	public void update(@RequestBody ShowVenue sv) {
		System.out.println("改了一个~~~~~~");
		service.update(sv);
	}
	//查询放映点信息
	@GetMapping("find")
	@ResponseBody
	public List<ShowVenue> findAll(String tid) {
		System.out.println("查了所有~~~~~~");
		return service.findAll(tid);
	}
	//查询单个放映点信息
		@GetMapping("find/{svid}")
		@ResponseBody
		public ShowVenue findOne(String  svid) {
			System.out.println("查了一个~~~~~~");
			return service.findOne(svid);
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
