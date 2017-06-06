package com.hcl.cil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.cil.dao.ProjectsDao;
import com.hcl.cil.dao.ProjectsServiceDao;
import com.hcl.cil.model.ProjectsDesc;
import com.hcl.cil.model.ProjectIdRequest;

@Service
public class ProjectsServiceImpl implements ProjectsServiceDao {

	@Autowired
	private ProjectsDao projectsDao;

	@Override
	public List<ProjectsDesc> getProjectsService(ProjectIdRequest projectId) 
	{	
		return projectsDao.getProjectsData(projectId);
	}
}
