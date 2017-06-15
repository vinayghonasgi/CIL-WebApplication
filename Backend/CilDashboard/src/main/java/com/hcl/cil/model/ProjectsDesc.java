package com.hcl.cil.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProjectsDesc 
{
	private  String id;
	private  String project_name;
	private  String stake_holders;
	private  String short_description;
	private  String long_description;
	private  ArrayList<String> technologies_used;
	private  ArrayList<String> tools;
	private  List<ProjectTeam> project_team;
	private  String duration_release;
	private  String domain;
	private  String progress;
	private  String project_id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getStake_holders() {
		return stake_holders;
	}
	public void setStake_holders(String stake_holders) {
		this.stake_holders = stake_holders;
	}
	public String getShort_description() {
		return short_description;
	}
	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}
	public String getLong_description() {
		return long_description;
	}
	public void setLong_description(String long_description) {
		this.long_description = long_description;
	}
	public ArrayList<String> getTechnologies_used() {
		return technologies_used;
	}
	public void setTechnologies_used(ArrayList<String> technologies_used) {
		this.technologies_used = technologies_used;
	}
	public ArrayList<String> getTools() {
		return tools;
	}
	public void setTools(ArrayList<String> tools) {
		this.tools = tools;
	}
	public List<ProjectTeam> getProject_team() {
		return project_team;
	}
	public void setProject_team(List<ProjectTeam> project_team) {
		this.project_team = project_team;
	}
	public String getDuration_release() {
		return duration_release;
	}
	public void setDuration_release(String duration_release) {
		this.duration_release = duration_release;
	}
	
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getProgress() {
		return progress;
	}
	public void setProgress(String progress) {
		this.progress = progress;
	}
	public String getProject_id() {
		return project_id;
	}
	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}
	
	
}
