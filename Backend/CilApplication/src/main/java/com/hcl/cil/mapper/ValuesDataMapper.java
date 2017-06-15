package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

import com.hcl.cil.model.Values;
import com.hcl.cil.model.ValuesData;


public class ValuesDataMapper implements RowMapper<Values>
{
	@Override
	public Values mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		String[] str;
		ValuesData vdata;
		ArrayList<ValuesData> values_data = new ArrayList<>();
		Values valuesInfo = new Values();
		
		valuesInfo.setValues_mainheading(rs.getString("keyvalues_heading"));
  				
		String[] vlist = rs.getString("keyvalues_list").split("#");
		for(int i = 0; i<vlist.length; i++)
		{	
 			vdata = new ValuesData();
 			str = vlist[i].split("~");
 			vdata.setValues_heading(str[0]);
 			vdata.setValues_description(str[1]);
 			values_data.add(vdata);	
		}
		
		valuesInfo.setValues_info(values_data);
		return valuesInfo;
	}
}
