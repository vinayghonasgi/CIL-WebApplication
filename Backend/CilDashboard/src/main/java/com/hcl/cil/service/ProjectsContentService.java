package com.hcl.cil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.cil.dao.ProjectsDao;
import com.hcl.cil.model.ProjectsDesc;
import com.hcl.cil.model.ProjectsContent;
import com.hcl.cil.model.ProjectIdRequest;

@Service
public class ProjectsContentService 
{
	@Autowired
	private ProjectsDao repository;
	
	@Autowired
	private ProjectIdRequest projectId;

	public ProjectsContent getProjectsContent()
	{
		ProjectsContent projectsContent = new ProjectsContent();
		
		List<ProjectsDesc> projectList 	= repository.getProjectsData(projectId);
		projectsContent.setProjects(projectList);
		
		return projectsContent;
	}
}
