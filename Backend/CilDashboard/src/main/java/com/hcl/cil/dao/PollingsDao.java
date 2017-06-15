package com.hcl.cil.dao;

import com.hcl.cil.model.PollingRequest;
import com.hcl.cil.model.PollingsResult;

public interface PollingsDao
{
	public PollingsResult getPollingsData(PollingRequest polling);
}
