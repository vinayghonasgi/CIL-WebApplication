package com.hcl.cil.dao;

import org.springframework.stereotype.Service;
import com.hcl.cil.model.PollingRequest;
import com.hcl.cil.model.PollingsResult;

@Service
public interface PollingsServiceDao 
{
 	public PollingsResult getProjectsService(PollingRequest polling);
}
