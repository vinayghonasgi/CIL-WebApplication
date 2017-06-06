package com.hcl.cil.dao;

import java.util.List;

import com.hcl.cil.model.*;

public interface DashboardDao
{
	public List<HclProjectList> getInternalProjectsData();
	public List<HclProjectList> getExternalProjectsData();
	public List<HclEventList> getEventsData();
	public List<HclPollingList> getPollingsData();
}
