package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.FilmMapper;
import com.woniuxy.domain.Film;
import com.woniuxy.service.IFilmService;
import com.woniuxy.util.AccountUtils;

@Service
public class FilmServiceImpl implements IFilmService {

	@Autowired
	private FilmMapper mapper;
	
	@Transactional
	@Override
	public void save(Film f) {
		f.setFid(AccountUtils.uuid());
		mapper.insertSelective(f);

	}

	@Transactional
	@Override
	public void delete(String fid) {
		mapper.deleteByPrimaryKey(fid);

	}

	@Transactional
	@Override
	public void update(Film e) {
		mapper.updateByPrimaryKeySelective(e);

	}

	@Transactional(readOnly = true)
	@Override
	public Film findOne(String fid) {
		return mapper.selectByPrimaryKey(fid);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Film> findAll() {
		return mapper.selectByExample(null);
	}

	

}
