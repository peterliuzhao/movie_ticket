package com.woniuxy.web.controller;



import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.woniuxy.domain.Customer;
import com.woniuxy.domain.Users;
import com.woniuxy.service.ICustomerService;
import com.woniuxy.service.IUserService;
import com.woniuxy.util.AccountUtils;

@RestController
@RequestMapping("customers")
public class CustomerController {

	@Autowired
	private ICustomerService service;
	@Autowired
	private IUserService uservice;
	
	@GetMapping(value = "fbt")
	public List<Customer> findByTid(String tid){
		List<Customer> list = service.findByTid(tid);
		return list;
	}
	
	@GetMapping
	public List<Customer> findOne(String field,String content,String tid) {
		content="\\w*"+content+"\\w*@*\\w*\\.*\\w*";
		System.out.println("CustomerController.findOne()"+content+"~~~~~~");
		List<Customer>target = service.findOneByField(field,content,tid);
		System.out.println("CustomerController.findOne()"+target.get(0).getCphone()+"!!!!!!!");
		return target;
	}
	
	@PostMapping
	public void save(@RequestBody Users user) {
		uservice.save(user);
		Customer cus=new Customer();
		cus.setCid(AccountUtils.uuid());
		cus.setCname(user.getUname());
		cus.setUid(user.getUid());
		cus.setTid(user.getTid());
		service.save(cus);
	}
	@PostMapping("/complete")
	public String update(@RequestParam CommonsMultipartFile cphoto,String cid) {
		String photoName = cphoto.getOriginalFilename();
		System.out.println("CustomerController.update()complete"+photoName+"/"+cid);
		String suffix=photoName.substring(photoName.lastIndexOf("."));
		//根据ID获取顾客，并将图片命名为顾客ID，再转存
		Customer cus=service.findOneById(cid);
		cus.setCphoto(cid+suffix);
//		cus.setCemail(cemail);
//		cus.setCphone(cphone);
		String photoPath="D:\\";
		File file=new File(photoPath+cid+suffix);
		if (!file.exists()) {
			file.mkdirs();
		}
		try {
			cphoto.transferTo(file);
			System.out.println("转存成功！");
			service.update(cus);
			return "成功！";
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("转存失败！");
			return "失败！";
		}
	}
	
	@PutMapping
	public void update(@RequestBody Customer cus) {
		service.update(cus);
	}
	
	@DeleteMapping("{cid}")
	public void delete(@PathVariable String cid) {
		service.delete(cid);
		System.out.println("CustomerController.delete()~~~"+cid);
	}
}
