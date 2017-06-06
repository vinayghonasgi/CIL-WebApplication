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
		strategicInfo.setId(rs.getString("strategic_id"));
		strategicInfo.setMain(rs.getString("strategic_heading"));
		strategicInfo.setLogo(rs.getString("strategic_logo"));
		strategicInfo.setStatus(rs.getString("strategic_status"));
		return strategicInfo;
	}
}
