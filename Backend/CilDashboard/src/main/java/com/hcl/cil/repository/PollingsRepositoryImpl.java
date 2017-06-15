package com.hcl.cil.repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.hcl.cil.dao.PollingsDao;
import com.hcl.cil.mapper.PollingsResultDataMapper;

import com.hcl.cil.model.PollingRequest;
import com.hcl.cil.model.PollingsResult;

@Repository
public class PollingsRepositoryImpl implements PollingsDao
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
	
	@Autowired
	private PollingsResult pollingsResult;
		
	@Override
	public PollingsResult getPollingsData(PollingRequest polling) 
	{
		SqlRowSet rs = template.queryForRowSet("SELECT * FROM pollings WHERE question_id = " + polling.getId() + "");
		if (rs.next()) 
		{
			if(rs.getString("question_option1").equals(polling.getOptions()) == true)
			{
				int poll1 = rs.getInt("question_option1_poll");
				poll1++;
				template.update("UPDATE pollings SET question_option1_poll = " + poll1 + " where question_id = " + polling.getId() + "");
			}
			if(rs.getString("question_option2").equals(polling.getOptions()) == true)
			{
				int poll2  = rs.getInt("question_option2_poll");
				poll2++;
				template.update("UPDATE pollings SET question_option2_poll = " + poll2 + " where question_id = " + polling.getId() + "");
			}
			if(rs.getString("question_option3").equals(polling.getOptions()) == true)
			{
				int poll3 = rs.getInt("question_option3_poll");
				poll3++;
				template.update("UPDATE pollings SET question_option3_poll = " + poll3 + " where question_id = " + polling.getId() + "");
			}
			if(rs.getString("question_option4").equals(polling.getOptions()) == true)
			{
				int poll4 = rs.getInt("question_option4_poll");
				poll4++;
				template.update("UPDATE pollings SET question_option4_poll = " + poll4 + " where question_id = " + polling.getId() + "");
			}
			pollingsResult =  template.queryForObject("SELECT * FROM pollings WHERE question_id = " + polling.getId() + "",new PollingsResultDataMapper());
			return pollingsResult;
		}
		return pollingsResult;
	}
}
