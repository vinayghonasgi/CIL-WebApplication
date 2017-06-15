package com.hcl.cil.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.hcl.cil.dao.ProjectsDao;
import com.hcl.cil.mapper.ProjectsDescDataMapper;
import com.hcl.cil.model.ProjectsDesc;
import com.hcl.cil.model.ProjectIdRequest;

@Repository
public class ProjectsRepositoryImpl implements ProjectsDao
{	
	private JdbcTemplate template;
	
	@Autowired
	private DataSource dataSource;
	
	@PostConstruct
	public void init()
	{
		template = new JdbcTemplate();
		template.setDataSource(dataSource);	
	}
	private List<ProjectsDesc> projectList  = new ArrayList<ProjectsDesc>();
	@Override
	public List<ProjectsDesc>  getProjectsData(ProjectIdRequest projectid) 
	{		
		SqlRowSet rs = template.queryForRowSet("SELECT * FROM ongoingprojects WHERE projects_id = " + projectid.getId() + "");
		if (rs.next()) 
		{
			projectList =  template.query("SELECT * FROM ongoingprojects WHERE projects_id = " + projectid.getId() + "",new ProjectsDescDataMapper());
		}
		return projectList;			
	}
}
