package com.hcl.cil.model;

import org.springframework.stereotype.Service;

@Service
public class ProjectsDesc 
{
	private  String id;
	private  String project_name;
	private  String stake_holders;
	private  String short_descriptions;
	private  String long_descriptions;
	private  String technologies_used;
	private  String tools_used;
	private  String build_tool;
	private  String project_team;
	private  String duration_release;
	private  String progress;
	private  String project_id;
	
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getProject_name() 
	{
		return project_name;
	}
	public void setProject_name(String project_name) 
	{
		this.project_name = project_name;
	}
	public String getStake_holders() 
	{
		return stake_holders;
	}
	public void setStake_holders(String stake_holders) 
	{
		this.stake_holders = stake_holders;
	}
	public String getShort_descriptions() 
	{
		return short_descriptions;
	}
	public void setShort_descriptions(String short_descriptions) 
	{
		this.short_descriptions = short_descriptions;
	}
	public String getLong_descriptions() 
	{
		return long_descriptions;
	}
	public void setLong_descriptions(String long_descriptions) 
	{
		this.long_descriptions = long_descriptions;
	}
	public String getTechnologies_used() 
	{
		return technologies_used;
	}
	public void setTechnologies_used(String technologies_used) 
	{
		this.technologies_used = technologies_used;
	}
	public String getTools_used() 
	{
		return tools_used;
	}
	public void setTools_used(String tools_used) 
	{
		this.tools_used = tools_used;
	}
	public String getBuild_tool() 
	{
		return build_tool;
	}
	public void setBuild_tool(String build_tool)
	{
		this.build_tool = build_tool;
	}
	public String getProject_team()
	{
		return project_team;
	}
	public void setProject_team(String project_team) 
	{
		this.project_team = project_team;
	}
	public String getDuration_release() 
	{
		return duration_release;
	}
	public void setDuration_release(String duration_release) 
	{
		this.duration_release = duration_release;
	}
	public String getProgress() 
	{
		return progress;
	}
	public void setProgress(String progress) 
	{
		this.progress = progress;
	}
	public String getProject_id() 
	{
		return project_id;
	}
	public void setProject_id(String project_id) 
	{
		this.project_id = project_id;
	}
	
	
}
