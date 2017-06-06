package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

import com.hcl.cil.model.About;

public class AboutDataMapper implements RowMapper<About>
{
	private ArrayList<String> about_featureslist;

	@Override
	public About mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		about_featureslist = new ArrayList<String>();
		About aboutInfo = new About();
		aboutInfo.setId(rs.getString("about_id"));
		aboutInfo.setDesc(rs.getString("about_description"));
		
		String[] list = rs.getString("about_list").split("~");
		for(int i = 0; i<list.length; i++)
		{
			about_featureslist.add(list[i]);
		}

		aboutInfo.setList(about_featureslist);
		aboutInfo.setMain(rs.getString("about_heading"));
		aboutInfo.setSub(rs.getString("about_subheading"));
		return aboutInfo;
	}
}
