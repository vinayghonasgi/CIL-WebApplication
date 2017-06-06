package com.hcl.cil.repository;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hcl.cil.dao.DashboardDao;
import com.hcl.cil.mapper.EventsDataMapper;
import com.hcl.cil.mapper.PollingsDataMapper;
import com.hcl.cil.mapper.ProjectListDataMapper;
import com.hcl.cil.model.HclEventList;
import com.hcl.cil.model.HclPollingList;
import com.hcl.cil.model.HclProjectList;

@Repository
public class DashboardRepositoryImpl implements DashboardDao
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
	
	@Override
	public List<HclProjectList> getInternalProjectsData() 
	{
		List<HclProjectList> internal = template.query("SELECT * FROM projects where projects_scope = 'internal'",new ProjectListDataMapper());
		return internal;
	}

	@Override
	public List<HclProjectList> getExternalProjectsData() 
	{
		List<HclProjectList> external = template.query("SELECT * FROM projects where projects_scope = 'external'",new ProjectListDataMapper());
		return external;
	}

	@Override
	public List<HclEventList> getEventsData() 
	{
		List<HclEventList> events = template.query("SELECT * FROM upcomingevents where event_status = 'active'",new EventsDataMapper());
		return events;
	}

	@Override
	public List<HclPollingList> getPollingsData() 
	{
		List<HclPollingList> polling = template.query("SELECT * FROM pollings where question_id = (select MAX(question_id) from pollings)" ,new PollingsDataMapper());
		return polling;
	}
}
