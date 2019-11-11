package com.woniuxy.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.woniuxy.domain.Film;
import com.woniuxy.service.IFilmService;
import com.woniuxy.util.AccountUtils;

@Controller
@RequestMapping("ft")
public class FilmController {
	
	@Autowired
	private IFilmService service;
	
	//增加电影
		@PostMapping("save")
		@ResponseBody
		public void save(@RequestBody Film f,@RequestParam(required = false) CommonsMultipartFile[] photo2, HttpServletRequest request) throws IllegalStateException, IOException {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < photo2.length; i++) {
				// 1. 后缀
				String oldName = photo2[i].getOriginalFilename();
				int lastDot = oldName.lastIndexOf(".");
				String ext = oldName.substring(lastDot);
				// 2. 文件名
				String newName =AccountUtils.uuid().toString().replaceAll("-", "") + ext;
				// 3. 上传路径
				String path = request.getServletContext().getRealPath("/images");
				// 如果上传的目录不存在，就创建一个！
				File dir = new File(path);
				if (!dir.exists()) {
					dir.mkdirs();
				}
				photo2[i].transferTo(new File(path, newName));
				// 数据入库
				sb.append(newName);
				sb.append(",");
			}
			sb.deleteCharAt(sb.length() - 1);
			f.setFphoto(sb.toString());
			service.save(f);
			
			System.out.println("加了一个~~~~~~");
			service.save(f);
		}
		//删除电影
		@DeleteMapping("delete/{fid}")
		@ResponseBody
		public void delete(@PathVariable String  fid) {
			System.out.println("删了一个,id为"+fid);
			service.delete(fid);
		}
		//修改电影信息
		@PutMapping("update")
		@ResponseBody
		public void update(@RequestBody Film f) {
			System.out.println("改了一个~~~~~~");
			service.update(f);
		}
		//查询电影信息
		@GetMapping("find")
		@ResponseBody
		public List<Film> findAll() {
			System.out.println("查了所有~~~~~~");
			return service.findAll();
		}
		//查询单个电影信息
			@GetMapping("find/{fid}")
			@ResponseBody
			public Film findOne(String  fid) {
				System.out.println("查了一个~~~zzzz~~~");
				return service.findOne(fid);
			}
	

}
