package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.hcl.cil.model.HclProjectList;

public class ProjectListDataMapper implements RowMapper<HclProjectList>
{
	@Override
	public HclProjectList mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		HclProjectList projectsInfo = new HclProjectList();
		projectsInfo.setId(rs.getString("projects_id"));
		projectsInfo.setProject_name(rs.getString("projects_name"));
		projectsInfo.setProject_scope(rs.getString("projects_scope"));
		return projectsInfo;
	}
}
