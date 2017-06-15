package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import com.hcl.cil.model.HclPollingList;

public class PollingsDataMapper implements RowMapper<HclPollingList>
{	
	@Override
	public HclPollingList mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		List<String> projectList = new ArrayList<>();
		HclPollingList pollingsInfo = new HclPollingList();
		pollingsInfo.setQid(rs.getInt("question_id"));
		pollingsInfo.setQname(rs.getString("question_name"));
		projectList.add(rs.getString("question_option1"));
		projectList.add(rs.getString("question_option2"));
		projectList.add(rs.getString("question_option3"));
		projectList.add(rs.getString("question_option4"));
		pollingsInfo.setOptions(projectList);
		return pollingsInfo;
	}
}
