package com.hcl.cil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.cil.dao.DashboardDao;
import com.hcl.cil.model.*;

@Service
public class DashboardService
{	
	@Autowired
	private DashboardDao repository;
	
	public Dashboard getDashboard()
	{
		Dashboard dashboard = new Dashboard();
		List<HclProjectList> externalprojectInfo= repository.getExternalProjectsData();
		dashboard.setExternalproject(externalprojectInfo);
		
		List<HclProjectList> internalprojectInfo= repository.getInternalProjectsData();
		dashboard.setInternalproject(internalprojectInfo);
		
		List<HclEventList> eventsInfo= repository.getEventsData();
		dashboard.setEvents(eventsInfo);
		
		HclPollingList pollingsInfo = repository.getPollingsData();
		dashboard.setPolling(pollingsInfo);
		
		UserResponse model = repository.getResponse();
		dashboard.setModel(model);
		
		return dashboard;
	}
	
}
