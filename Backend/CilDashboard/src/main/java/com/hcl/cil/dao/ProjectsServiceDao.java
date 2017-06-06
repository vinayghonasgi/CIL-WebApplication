package com.hcl.cil.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.cil.model.ProjectsDesc;
import com.hcl.cil.model.ProjectIdRequest;

@Service
public interface ProjectsServiceDao 
{
 	public List<ProjectsDesc> getProjectsService(ProjectIdRequest projectId);
}
