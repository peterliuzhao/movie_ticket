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
import org.springframework.web.bind.annotation.ResponseBody;
import com.woniuxy.domain.FilmType;
import com.woniuxy.service.IFilmTypeService;

@Controller
@RequestMapping("ft")
public class FilmTypeController {
	
	@Autowired
	private IFilmTypeService service;
	
	//增加电影类型
		@PostMapping("save")
		@ResponseBody
		public void save(@RequestBody FilmType ft) {
			System.out.println("加了一个~~~~~~"+ft.getFtinfo());
			service.save(ft);
		}
		//删除电影类型
		@DeleteMapping("delete/{ftid}")
		@ResponseBody
		public void delete(@PathVariable String  ftid) {
			System.out.println("删了一个,id为"+ftid);
			service.delete(ftid);
		}
		//修改电影类型信息
		@PutMapping("update")
		@ResponseBody
		public void update(@RequestBody FilmType ft) {
			System.out.println("改了一个~~~~~~");
			service.update(ft);
		}
		//查询电影类型信息
		@GetMapping("find")
		@ResponseBody
		public List<FilmType> findAll() {
			System.out.println("查了所有~~~~~~");
			return service.findAll();
		}
		//查询单个电影类型信息
			@GetMapping("find/{ftid}")
			@ResponseBody
			public FilmType findOne(String  ftid) {
				System.out.println("查了一个~~~~~~");
				return service.findOne(ftid);
			}
	

}
