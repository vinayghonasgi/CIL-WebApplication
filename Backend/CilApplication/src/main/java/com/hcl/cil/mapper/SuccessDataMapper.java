package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

import com.hcl.cil.model.ServicesData;
import com.hcl.cil.model.Success;
import com.hcl.cil.model.SuccessData;

public class SuccessDataMapper implements RowMapper<Success>
{
	@Override
	public Success mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		String[] str;
		SuccessData sdata;
		
		ArrayList<SuccessData> success_data = new ArrayList<>();
		Success successInfo = new Success();
		successInfo.setSuccess_mainheading(rs.getString("success_heading"));
		successInfo.setSuccess_subheading(rs.getString("success_subheading"));
		
		String[] slist = rs.getString("success_list").split("#");
		for(int i = 0; i<slist.length; i++)
		{	
			sdata = new SuccessData();
 			str = slist[i].split("~");
 			sdata.setSuccess_heading(str[0]);
 			sdata.setSuccess_description(str[1]);
 			success_data.add(sdata);	
		}
		
		successInfo.setSuccess_info(success_data);		
		return successInfo;
	}
}
