package com.hcl.cil.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardContent 
{
	@Autowired
	private Dashboard dashboard;

	public Dashboard getDashboard() 
	{
		return dashboard;
	}

	public void setDashboard(Dashboard dashboard) 
	{
		this.dashboard = dashboard;
	}
	
	
}
