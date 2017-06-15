package com.hcl.cil.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PollingsContents 
{
	@Autowired
	private PollingsResult polling;

	public PollingsResult getPolling() 
	{
		return polling;
	}

	public void setPolling(PollingsResult polling) 
	{
		this.polling = polling;
	}
}
