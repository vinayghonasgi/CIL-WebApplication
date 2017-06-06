package com.hcl.cil.dao;

import java.util.List;

import com.hcl.cil.model.ProjectIdRequest;
import com.hcl.cil.model.ProjectsDesc;

public interface ProjectsDao
{
	
	public List<ProjectsDesc> getProjectsData(ProjectIdRequest projectid);
}
