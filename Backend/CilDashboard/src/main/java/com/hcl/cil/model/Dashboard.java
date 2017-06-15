package com.hcl.cil.model;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Dashboard 
{
	private List<HclProjectList> externalproject;
	private List<HclProjectList> internalproject;
	private List<HclEventList> events;
	private HclPollingList polling;
	private UserResponse model;
	
	public List<HclProjectList> getExternalproject() 
	{
		return externalproject;
	}
	public void setExternalproject(List<HclProjectList> externalproject) 
	{
		this.externalproject = externalproject;
	}
	public List<HclProjectList> getInternalproject() 
	{
		return internalproject;
	}
	public void setInternalproject(List<HclProjectList> internalproject) 
	{
		this.internalproject = internalproject;
	}
	public List<HclEventList> getEvents() 
	{
		return events;
	}
	public void setEvents(List<HclEventList> events) 
	{
		this.events = events;
	}
	public HclPollingList getPolling() 
	{
		return polling;
	}
	public void setPolling(HclPollingList polling) 
	{
		this.polling = polling;
	}
	public UserResponse getModel() 
	{
		return model;
	}
	public void setModel(UserResponse model) 
	{
		this.model = model;
	}	
}
