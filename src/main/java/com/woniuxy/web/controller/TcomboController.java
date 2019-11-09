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
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.woniuxy.domain.Tcombo;
import com.woniuxy.domain.Users;
import com.woniuxy.service.ITcomboService;
import com.woniuxy.service.IUserService;
import com.woniuxy.util.AccountUtils;

@Controller
@RequestMapping("tcombos")
public class TcomboController {

	@Autowired
	private ITcomboService service;
	
	//shiro 注册 用户增加加密
	@GetMapping("find")
	@ResponseBody
	public List<Tcombo> findThearterCombo(String uname) {
		return service.findTheaterComboOrdersByUserName(uname);
	}

}
