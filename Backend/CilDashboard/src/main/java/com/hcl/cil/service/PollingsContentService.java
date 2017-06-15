package com.hcl.cil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.cil.dao.PollingsDao;
import com.hcl.cil.model.PollingRequest;
import com.hcl.cil.model.PollingsContents;
import com.hcl.cil.model.PollingsResult;

@Service
public class PollingsContentService 
{
	@Autowired
	private PollingsDao repository;
	
	@Autowired
	private PollingRequest polling;

	public PollingsContents getPollingsContent()
	{
		PollingsContents pollingsContent = new PollingsContents();
		
		PollingsResult pollingResult 	= repository.getPollingsData(polling);
		pollingsContent.setPolling(pollingResult);
		
		return pollingsContent;
	}
}
