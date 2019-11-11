package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.FilmTypeMapper;
import com.woniuxy.domain.FilmType;
import com.woniuxy.service.IFilmTypeService;
import com.woniuxy.util.AccountUtils;

@Service
public class FilmTypeServiceImpl implements IFilmTypeService{
	

	@Autowired
	private FilmTypeMapper mapper;
	
	@Transactional
	@Override
	public void save(FilmType ft) {
		ft.setFtid(AccountUtils.uuid());
		mapper.insertSelective(ft);
		
	}
	
	@Transactional
	@Override
	public void delete(String ftid) {
		mapper.deleteByPrimaryKey(ftid);
		
	}

	@Transactional
	@Override
	public void update(FilmType ft) {
		mapper.updateByPrimaryKeySelective(ft);
		
	}

	@Transactional(readOnly = true)
	@Override
	public FilmType findOne(String ftid) {
		return mapper.selectByPrimaryKey(ftid);
	}

	@Transactional(readOnly = true)
	@Override
	public List<FilmType> findAll() {
		return mapper.selectByExample(null);
	}

}
