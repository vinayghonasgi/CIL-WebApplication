package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

import com.hcl.cil.model.Success;

public class SuccessDataMapper implements RowMapper<Success>
{
	private  ArrayList<String> success_stories;
	@Override
	public Success mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		success_stories = new ArrayList<String>();
		Success successInfo = new Success();
		successInfo.setId(rs.getString("success_id"));
		successInfo.setMain(rs.getString("success_heading"));
		successInfo.setSub(rs.getString("success_subheading"));
		
		String[] list = rs.getString("success_list").split("~");
		for(int i = 0; i<list.length; i++)
		{
			success_stories.add(list[i]);
		}
		
		successInfo.setList(success_stories);		
		return successInfo;
	}
}
