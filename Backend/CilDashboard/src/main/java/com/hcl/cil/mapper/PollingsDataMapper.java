package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.hcl.cil.model.HclPollingList;

public class PollingsDataMapper implements RowMapper<HclPollingList>
{
	@Override
	public HclPollingList mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		HclPollingList pollingsInfo = new HclPollingList();
		pollingsInfo.setQid(rs.getInt("question_id"));
		pollingsInfo.setQname(rs.getString("question_name"));
		pollingsInfo.setQoption1(rs.getString("question_option1"));
		pollingsInfo.setQoption2(rs.getString("question_option2"));
		pollingsInfo.setQoption3(rs.getString("question_option3"));
		pollingsInfo.setQoption4(rs.getString("question_option4"));
		pollingsInfo.setQoption5(rs.getString("question_option5"));
		pollingsInfo.setQoption6(rs.getString("question_option6"));
		return pollingsInfo;
	}
}
