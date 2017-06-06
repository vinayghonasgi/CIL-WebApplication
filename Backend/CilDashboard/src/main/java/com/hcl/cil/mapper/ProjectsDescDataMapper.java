package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.hcl.cil.model.ProjectsDesc;

public class ProjectsDescDataMapper implements RowMapper<ProjectsDesc>
{
	@Override
	public ProjectsDesc mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		ProjectsDesc onGoingProjectInfo = new ProjectsDesc();
		onGoingProjectInfo.setId(rs.getString("ongoingprojects_id"));
		onGoingProjectInfo.setProject_name(rs.getString("ongoingprojects_project_name"));
		onGoingProjectInfo.setStake_holders(rs.getString("ongoingprojects_stake_holders"));
		onGoingProjectInfo.setShort_descriptions(rs.getString("ongoingprojects_short_description"));
		onGoingProjectInfo.setLong_descriptions(rs.getString("ongoingprojects_long_description"));
		onGoingProjectInfo.setTechnologies_used(rs.getString("ongoingprojects_technologies_used"));
		onGoingProjectInfo.setTools_used(rs.getString("ongoingprojects_tools_used"));
		onGoingProjectInfo.setBuild_tool(rs.getString("ongoingprojects_build_tools"));
		onGoingProjectInfo.setProject_team(rs.getString("ongoingprojects_project_team"));
		onGoingProjectInfo.setDuration_release(rs.getString("ongoingprojects_duration_release"));
		onGoingProjectInfo.setProgress(rs.getString("ongoingprojects_progress"));
		onGoingProjectInfo.setProject_id(rs.getString("projects_id"));
		return onGoingProjectInfo;
	}
}
