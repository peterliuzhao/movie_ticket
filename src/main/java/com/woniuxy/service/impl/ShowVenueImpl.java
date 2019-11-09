package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.ShowVenueMapper;
import com.woniuxy.domain.ShowVenue;
import com.woniuxy.service.IShowVenueService;
import com.woniuxy.util.AccountUtils;

@Service
public class ShowVenueImpl implements IShowVenueService {
	
	@Autowired
	private ShowVenueMapper mapper;
	
	@Transactional
	@Override
	public void save(ShowVenue sv) {
		sv.setSvid(AccountUtils.uuid());
		mapper.insertSelective(sv);
		
	}

	@Transactional
	@Override
	public void delete(String svid) {
		mapper.deleteByPrimaryKey(svid);

	}

	@Transactional
	@Override
	public void update(ShowVenue sv) {
		mapper.updateByPrimaryKeySelective(sv);

	}

	@Transactional(readOnly = true)
	@Override
	public ShowVenue findOne(String svid) {
		return mapper.selectByPrimaryKey(svid);
	}

	@Transactional(readOnly = true)
	@Override
	public List<ShowVenue> findAll(String tid) {
		return mapper.findByTid(tid);
	}

}
