package com.hcl.cil.repository;

import java.util.List;

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
	List<PollingsResult> pollingsResult;
	
	@Override
	public List<PollingsResult> getPollingsData(PollingRequest polling) 
	{
		SqlRowSet rs = template.queryForRowSet("SELECT * FROM pollings WHERE question_id = " + polling.getId() + "");
		if (rs.next()) 
		{
			if(rs.getString("question_option1").equals(polling.getOptions()) == true)
			{
				int poll = rs.getInt("question_option1_poll");
				poll++;
				template.update("UPDATE pollings SET question_option1_poll = " + poll + " where question_id = " + polling.getId() + "");
			}
			if(rs.getString("question_option2").equals(polling.getOptions()) == true)
			{
				int poll = rs.getInt("question_option2_poll");
				poll++;
				template.update("UPDATE pollings SET question_option2_poll = " + poll + " where question_id = " + polling.getId() + "");
			}
			if(rs.getString("question_option3").equals(polling.getOptions()) == true)
			{
				int poll = rs.getInt("question_option3_poll");
				poll++;
				template.update("UPDATE pollings SET question_option3_poll = " + poll + " where question_id = " + polling.getId() + "");
			}
			if(rs.getString("question_option4").equals(polling.getOptions()) == true)
			{
				int poll = rs.getInt("question_option4_poll");
				poll++;
				template.update("UPDATE pollings SET question_option4_poll = " + poll + " where question_id = " + polling.getId() + "");
			}
			if(rs.getString("question_option5").equals(polling.getOptions()) == true)
			{
				int poll = rs.getInt("question_option5_poll");
				poll++;
				template.update("UPDATE pollings SET question_option5_poll = " + poll + " where question_id = " + polling.getId() + "");
			}
			if(rs.getString("question_option6").equals(polling.getOptions()) == true)
			{
				int poll = rs.getInt("question_option6_poll");
				poll++;
				template.update("UPDATE pollings SET question_option6_poll = " + poll + " where question_id = " + polling.getId() + "");
			}
			List<PollingsResult> pollingsResult =  template.query("SELECT * FROM pollings WHERE question_id = " + polling.getId() + "",new PollingsResultDataMapper());
			this.pollingsResult = pollingsResult;
			return pollingsResult;			
		}
		return pollingsResult;
	}
}
