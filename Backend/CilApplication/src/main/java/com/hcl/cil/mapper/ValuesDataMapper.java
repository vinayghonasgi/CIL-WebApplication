package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

import com.hcl.cil.model.Values;


public class ValuesDataMapper implements RowMapper<Values>
{
	private ArrayList<String> values_list;

	@Override
	public Values mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		values_list = new ArrayList<String>();
		Values valuesInfo = new Values();
		valuesInfo.setId(rs.getString("keyvalues_id"));
		valuesInfo.setMain(rs.getString("keyvalues_heading"));
  		
		String[] list = rs.getString("keyvalues_list").split("~");
		for(int i = 0; i<list.length; i++)
		{
			values_list.add(list[i]);
		}
		
		valuesInfo.setList(values_list);
		return valuesInfo;
	}
}
