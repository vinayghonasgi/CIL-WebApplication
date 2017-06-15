package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

import com.hcl.cil.model.Services;
import com.hcl.cil.model.ServicesData;

public class ServiceDataMapper implements RowMapper<Services>
{
	@Override
	public Services mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		String[] str;
		ServicesData sdata;
		
		ArrayList<ServicesData> success_data = new ArrayList<>();
		Services serviceInfo = new Services();
		serviceInfo.setService_mainheading(rs.getString("service_heading"));
		
		String[] slist = rs.getString("service_list").split("#");
		for(int i = 0; i<slist.length; i++)
		{	
			sdata = new ServicesData();
 			str = slist[i].split("~");
 			sdata.setService_heading(str[0]);
 			sdata.setService_description(str[1]);
 			success_data.add(sdata);	
		}
		serviceInfo.setService_offering(success_data);
		return serviceInfo;
	}
}

