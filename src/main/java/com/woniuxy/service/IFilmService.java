package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Film;

public interface IFilmService {
	void save(Film f);
	void delete(String fid);
	void update(Film e);
	Film findOne(String fid);
	List<Film> findAll();

}
