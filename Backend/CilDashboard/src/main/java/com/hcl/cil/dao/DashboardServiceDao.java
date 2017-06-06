package com.hcl.cil.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.cil.model.*;

@Service
public interface DashboardServiceDao
{
	public List<HclProjectList> getInternalProjectsData();
	public List<HclProjectList> getExternalProjectsData();
	public List<HclEventList> getEventsData();
}
