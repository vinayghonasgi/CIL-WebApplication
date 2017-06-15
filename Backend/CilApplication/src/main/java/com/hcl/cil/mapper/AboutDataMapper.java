package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

import com.hcl.cil.model.About;

public class AboutDataMapper implements RowMapper<About>
{

	@Override
	public About mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		ArrayList<String> about_featureslist = new ArrayList<>();
		About aboutInfo = new About();
		aboutInfo.setAbout_description(rs.getString("about_description"));
		
		String[] list = rs.getString("about_list").split("~");
		for(int i = 0; i<list.length; i++)
		{
			about_featureslist.add(list[i]);
		}

		aboutInfo.setAbout_info(about_featureslist);
		aboutInfo.setAbout_mainheading(rs.getString("about_heading"));
		aboutInfo.setAbout_subheading(rs.getString("about_subheading"));
		return aboutInfo;
	}
}
