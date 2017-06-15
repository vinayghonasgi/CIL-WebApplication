package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import com.hcl.cil.model.PollingsResult;

public class PollingsResultDataMapper implements RowMapper<PollingsResult>
{
	@Override
	public PollingsResult mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		float poll1 = (float)rs.getInt("question_option1_poll");
		float poll2 = (float)rs.getInt("question_option2_poll");
		float poll3 = (float)rs.getInt("question_option3_poll");
		float poll4 = (float)rs.getInt("question_option4_poll");
		
		int total = (int) (poll1 + poll2 + poll3 + poll4);		
		poll1 = Math.round((poll1 / total) * 100);
		poll2 = Math.round((poll2 / total) * 100);
		poll3 = Math.round((poll3 / total) * 100);
		poll4 = Math.round((poll4 / total) * 100);
		 		
		PollingsResult pollingsResults = new PollingsResult();
		pollingsResults.setQid(rs.getInt("question_id"));
		pollingsResults.setQname(rs.getString("question_name"));
		
		HashMap<String,String> opti = new HashMap<>();
		List<HashMap<String,String>> options = new ArrayList<>();
		
		opti.put("value", rs.getString("question_option1"));
		opti.put("poll", String.valueOf((int)poll1));
		options.add(opti);
		opti = new HashMap<>();
		opti.put("value", rs.getString("question_option2"));
		opti.put("poll", String.valueOf((int)poll2));
		options.add(opti);
		opti = new HashMap<>();
		opti.put("value", rs.getString("question_option3"));
		opti.put("poll", String.valueOf((int)poll3));
		options.add(opti);
		opti = new HashMap<>();
		opti.put("value", rs.getString("question_option4"));
		opti.put("poll", String.valueOf((int)poll4));
		options.add(opti);
		
		pollingsResults.setQoptions(options);
		pollingsResults.setTotal(total);
		return pollingsResults;
	}
}
