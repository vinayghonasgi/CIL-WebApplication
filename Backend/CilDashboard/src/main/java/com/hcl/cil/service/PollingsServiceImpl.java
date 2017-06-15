package com.hcl.cil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.cil.dao.PollingsDao;
import com.hcl.cil.dao.PollingsServiceDao;
import com.hcl.cil.model.PollingRequest;
import com.hcl.cil.model.PollingsResult;

@Service
public class PollingsServiceImpl implements PollingsServiceDao {

	@Autowired
	private PollingsDao pollingsDao;

	@Override
	public PollingsResult getProjectsService(PollingRequest polling) 
	{
		return pollingsDao.getPollingsData(polling);
	}
}
