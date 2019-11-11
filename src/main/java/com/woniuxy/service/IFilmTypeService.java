package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.FilmType;

public interface IFilmTypeService {
	public void save(FilmType ft);
	public void delete(String ftid);
	public void update(FilmType ft);
	public FilmType findOne(String ftid);
	public List<FilmType> findAll();

}
