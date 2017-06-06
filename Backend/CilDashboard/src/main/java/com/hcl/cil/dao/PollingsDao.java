package com.hcl.cil.dao;

import java.util.List;

import com.hcl.cil.model.PollingRequest;
import com.hcl.cil.model.PollingsResult;

public interface PollingsDao
{
	public List<PollingsResult> getPollingsData(PollingRequest polling);
}
