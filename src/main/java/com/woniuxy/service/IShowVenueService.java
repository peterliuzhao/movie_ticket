package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.ShowVenue;

public interface IShowVenueService {

	public void save(ShowVenue sv);
	public void delete(String svid);
	public void update(ShowVenue sv);
	public ShowVenue findOne(String svid);
	public List<ShowVenue> findAll(String tid);


}
