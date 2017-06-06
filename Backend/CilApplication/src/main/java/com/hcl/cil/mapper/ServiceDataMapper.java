package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

import com.hcl.cil.model.Services;

public class ServiceDataMapper implements RowMapper<Services>
{
	private ArrayList<String> service_list;
	@Override
	public Services mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		service_list = new ArrayList<String>();
		Services serviceInfo = new Services();
		serviceInfo.setId(rs.getString("service_id"));
		serviceInfo.setMain(rs.getString("service_heading"));
		
		String[] list = rs.getString("service_list").split("~");
		for(int i = 0; i<list.length; i++)
		{
			service_list.add(list[i]);
		}
		
		serviceInfo.setList(service_list);
		return serviceInfo;
	}
}

