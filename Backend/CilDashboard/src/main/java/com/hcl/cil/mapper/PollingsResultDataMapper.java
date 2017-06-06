package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.hcl.cil.model.PollingsResult;

public class PollingsResultDataMapper implements RowMapper<PollingsResult>
{
	@Override
	public PollingsResult mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		PollingsResult pollingsResults = new PollingsResult();
		pollingsResults.setQid(rs.getInt("question_id"));
		pollingsResults.setQname(rs.getString("question_name"));
		pollingsResults.setQoption1(rs.getString("question_option1"));
		pollingsResults.setQoption1_poll(rs.getString("question_option1_poll"));
		pollingsResults.setQoption2(rs.getString("question_option2"));
		pollingsResults.setQoption2_poll(rs.getString("question_option2_poll"));
		pollingsResults.setQoption3(rs.getString("question_option3"));
		pollingsResults.setQoption3_poll(rs.getString("question_option3_poll"));
		pollingsResults.setQoption4(rs.getString("question_option4"));
		pollingsResults.setQoption4_poll(rs.getString("question_option4_poll"));
		pollingsResults.setQoption5(rs.getString("question_option5"));
		pollingsResults.setQoption5_poll(rs.getString("question_option5_poll"));
		pollingsResults.setQoption6(rs.getString("question_option6"));
		pollingsResults.setQoption6_poll(rs.getString("question_option6_poll"));
		return pollingsResults;
	}
}
