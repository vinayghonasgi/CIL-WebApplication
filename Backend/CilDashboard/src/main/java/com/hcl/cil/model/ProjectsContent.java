package com.hcl.cil.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectsContent 
{
	@Autowired
	private List<ProjectsDesc> projects;

	public List<ProjectsDesc> getProjects() 
	{
		return projects;
	}

	public void setProjects(List<ProjectsDesc> onGoingProjects) 
	{
		this.projects = onGoingProjects;
	}
}
