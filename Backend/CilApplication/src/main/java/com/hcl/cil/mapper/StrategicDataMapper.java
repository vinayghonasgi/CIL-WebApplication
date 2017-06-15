package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hcl.cil.model.Strategic;

public class StrategicDataMapper implements RowMapper<Strategic>
{
	@Override
	public Strategic mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		Strategic strategicInfo = new Strategic();
		strategicInfo.setStrategic_mainheading(rs.getString("strategic_heading"));
		strategicInfo.setStrategic_logo(rs.getString("strategic_logo"));
		strategicInfo.setStrategic_status(rs.getString("strategic_status"));
		return strategicInfo;
	}
}
