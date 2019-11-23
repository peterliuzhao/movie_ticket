package com.woniuxy.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import com.woniuxy.domain.Film;
import com.woniuxy.domain.FilmType;
import com.woniuxy.service.IFilmService;
import com.woniuxy.service.IFilmTypeService;
import com.woniuxy.util.AccountUtils;

@RestController
@RequestMapping("film")
public class FilmController {

	@Autowired
	private IFilmService service;
	@Autowired
	private IFilmTypeService service2;

	// 增加电影
	@PostMapping("save")
	public void save(Film film, 
			@RequestParam(required = false) CommonsMultipartFile[] photo,
			@RequestParam(required = false) CommonsMultipartFile[] actorPhoto,
			@RequestParam(required = false) CommonsMultipartFile preview, HttpServletRequest request)
			throws IllegalStateException, IOException {
		// 1、上传电影剧照（多文件上传）
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < photo.length; i++) {
			System.out.println(photo[i].getOriginalFilename()
					+ "__________________2222222222222222222222222222222222222222222222");
			// 1. 后缀
			String oldName = photo[i].getOriginalFilename();
			int lastDot = oldName.lastIndexOf(".");
			// 2. 文件名
			String newName = AccountUtils.uuid().toString().replaceAll("-", "") + oldName.substring(lastDot);
			// 3. 上传路径
			String imagePath = request.getServletContext().getRealPath("/images");
			// 如果上传的目录不存在，就创建一个！
			File images = new File(imagePath);
			if (!images.exists()) {
				images.mkdirs();
			}
			// 将照片数组存入文件夹
			photo[i].transferTo(new File(imagePath, newName));
			sb.append(newName);
			sb.append(",");
		}
		sb.deleteCharAt(sb.length() - 1);
		// 2、上传主演照片（多文件上传）
		StringBuilder sb2 = new StringBuilder();
		System.out.println("~~~~~~~~~~~~~~~~!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		for (int i = 0; i < actorPhoto.length; i++) {
			System.out.println(
					actorPhoto[i].getOriginalFilename() + "__________________33333333333333333333333333333333333333");
			// 1. 后缀
			String oldName2 = actorPhoto[i].getOriginalFilename();
			int lastDot2 = oldName2.lastIndexOf(".");
			// 2. 文件名
			String newName2 = AccountUtils.uuid().toString().replaceAll("-", "") + oldName2.substring(lastDot2);
			// 3. 上传路径
			String imagePath = request.getServletContext().getRealPath("/images");
			// 如果上传的目录不存在，就创建一个！
			File images = new File(imagePath);
			if (!images.exists()) {
				images.mkdirs();
			}
			// 将照片数组存入文件夹
			actorPhoto[i].transferTo(new File(imagePath, newName2));
			sb2.append(newName2);
			sb2.append(",");
		}
		sb2.deleteCharAt(sb2.length() - 1);

		// 3、上传电影预告片
		String oldName3 = preview.getOriginalFilename();
		int lastDot3 = oldName3.lastIndexOf(".");
		String videoName = AccountUtils.uuid().toString().replaceAll("-", "") + oldName3.substring(lastDot3);
		String videoPath = request.getServletContext().getRealPath("/videos");
		File videos = new File(videoPath);
		if (!videos.exists()) {
			videos.mkdirs();
		}
		// 将预告片存入文件夹
		preview.transferTo(new File(videoPath, videoName));

		// 数据入库
		film.setFid(AccountUtils.uuid());
		film.setFphoto(sb.toString());
		film.setFactorPhoto(sb2.toString());
		film.setFpreview(videoName);
		// film.setFtid("1f56400a683e491893362c0260db485c");
		service.save(film);
	}

	// 删除电影
	@DeleteMapping("delete/{fid}")
	public void delete(@PathVariable String fid, HttpServletRequest request) {
		// 删除图片
		Film film = service.findOne(fid);
		System.out.println(fid);
		String photo = film.getFphoto();
		String actorPhoto = film.getFactorPhoto();
		String path = request.getServletContext().getRealPath("/images");
		File images1 = new File(path, photo);
		File images2 = new File(path, actorPhoto);
		String video = film.getFpreview();
		String videoPath = request.getServletContext().getRealPath("/videos");
		File videos = new File(video, videoPath);
		images1.delete();
		images2.delete();
		videos.delete();
		// 删除数据库中的图片
		service.delete(fid);
		System.out.println("删了一个,id为" + fid);
	}

	// 修改电影信息
	@PostMapping("update")
	public void update(Film film,
			@RequestParam(required = false) CommonsMultipartFile[] photo2,
			@RequestParam(required = false) CommonsMultipartFile[] actorPhoto2,
			@RequestParam(required = false) CommonsMultipartFile preview2, HttpServletRequest request)
			throws IllegalStateException, IOException {
		// 删除旧图
		String oldImgFile1 = service.findOne(film.getFid()).getFphoto();
		String oldImgFile2 = service.findOne(film.getFid()).getFactorPhoto();
		String imagePath = request.getServletContext().getRealPath("/images");
		File images1 = new File(imagePath, oldImgFile1);
		File images2 = new File(imagePath, oldImgFile2);
		images1.delete();
		images2.delete();
		// 删除旧视频
		String oldVideoFile = service.findOne(film.getFid()).getFpreview();
		String videoPath = request.getServletContext().getRealPath("/videos");
		File videos1 = new File(videoPath, oldVideoFile);
		videos1.delete();
		// 1、上传电影剧照（多文件上传）
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < photo2.length; i++) {
			String oldName = photo2[i].getOriginalFilename();
			int lastDot = oldName.lastIndexOf(".");
			String newName = AccountUtils.uuid().toString().replaceAll("-", "") + oldName.substring(lastDot);
			File images = new File(imagePath);
			if (!images.exists()) {
				images.mkdirs();
			}
			photo2[i].transferTo(new File(imagePath, newName));
			sb.append(newName);
			sb.append(",");
		}
		sb.deleteCharAt(sb.length() - 1);
//2、上传主演照片（多文件上传）
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < actorPhoto2.length; i++) {
			// 1. 后缀
			String oldName2 = actorPhoto2[i].getOriginalFilename();
			int lastDot2 = oldName2.lastIndexOf(".");
			// 2. 文件名
			String newName2 = AccountUtils.uuid().toString().replaceAll("-", "") + oldName2.substring(lastDot2);
			// 3. 上传路径
			// 如果上传的目录不存在，就创建一个！
			File images = new File(imagePath);
			if (!images.exists()) {
				images.mkdirs();
			}
			// 将照片数组存入文件夹
			actorPhoto2[i].transferTo(new File(imagePath, newName2));
			sb2.append(newName2);
			sb2.append(",");
		}
		sb2.deleteCharAt(sb2.length() - 1);

//3、上传电影预告片
		String oldName3 = preview2.getOriginalFilename();
		int lastDot3 = oldName3.lastIndexOf(".");
		String videoName = AccountUtils.uuid().toString().replaceAll("-", "") + oldName3.substring(lastDot3);
		File videos = new File(videoPath);
		if (!videos.exists()) {
			videos.mkdirs();
		}
		// 将预告片存入文件夹
		preview2.transferTo(new File(videoPath, videoName));

// 数据入库
//		film.setFid(film.getFid());
		film.setFphoto(sb.toString());
		film.setFactorPhoto(sb2.toString());
		film.setFpreview(videoName);
		service.update(film);
		System.out.println("改了一个~~~~~~");
	}

	// 查询电影信息
	@GetMapping
	public List<List> findAll() {
		System.out.println("查了所有!!!!!!!!~~~~~~");
		List<List> list = new ArrayList<List>();
		List<Film> flist = service.findAll();
		List<String[]> factorPhotos = new ArrayList<>();
		List<String[]> fphotos = new ArrayList<>();
		List<FilmType> ftlist = service2.findAll();
		for (int i = 0; i < flist.size(); i++) {
			String[] factorPhoto = flist.get(i).getFactorPhoto().split(",");
			factorPhotos.add(factorPhoto);
			String[] fphoto = flist.get(i).getFphoto().split(",");
			fphotos.add(fphoto);
			System.out.println(fphoto);
			System.out.println(factorPhoto);
			for (int j = 0; j < ftlist.size(); j++) {
				if (flist.get(i).getFtid().equals(ftlist.get(j).getFtid())) {
					flist.get(i).setFtid(ftlist.get(j).getFtname());
					System.out.println(ftlist.get(j).getFtname() + ":" + flist.get(i).getFinfo());
				}
			}
		}
		System.out.println(fphotos);
		System.out.println(factorPhotos);
		list.add(flist);
		list.add(ftlist);
		list.add(factorPhotos);
		list.add(fphotos);
		return list;
	}
	// 查询单个电影信息
	@GetMapping("find/{fid}")
	public Film findOne(@PathVariable String fid) {
		System.out.println("查了一个~~~~~~");
		return service.findOne(fid);
	}
}
