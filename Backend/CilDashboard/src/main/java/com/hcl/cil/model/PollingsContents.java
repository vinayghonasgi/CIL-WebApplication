package com.hcl.cil.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PollingsContents 
{
	@Autowired
	private List<PollingsResult> polling;

	public List<PollingsResult> getPolling() {
		return polling;
	}

	public void setPolling(List<PollingsResult> polling) {
		this.polling = polling;
	}

	
}
