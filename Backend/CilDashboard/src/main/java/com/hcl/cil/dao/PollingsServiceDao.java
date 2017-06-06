package com.hcl.cil.dao;

import java.util.List;

import org.springframework.stereotype.Service;
import com.hcl.cil.model.PollingRequest;
import com.hcl.cil.model.PollingsResult;

@Service
public interface PollingsServiceDao 
{
 	public List<PollingsResult> getProjectsService(PollingRequest polling);
}