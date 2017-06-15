package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

import com.hcl.cil.model.ProjectTeam;
import com.hcl.cil.model.ProjectsDesc;
public class ProjectsDescDataMapper implements RowMapper<ProjectsDesc>
{
	@Override
	public ProjectsDesc mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		String[] str;
		
		ArrayList<ProjectTeam> projectTeam = new ArrayList<ProjectTeam>();
		ArrayList<String> technologies_used = new ArrayList<>();
		ArrayList<String> tools = new ArrayList<>();
		
		ProjectTeam pteam = new ProjectTeam();
		ProjectsDesc onGoingProjectInfo = new ProjectsDesc();
		
		onGoingProjectInfo.setId(rs.getString("ongoingprojects_id"));
		onGoingProjectInfo.setProject_name(rs.getString("ongoingprojects_project_name"));
		onGoingProjectInfo.setStake_holders(rs.getString("ongoingprojects_stake_holders"));
		onGoingProjectInfo.setShort_description(rs.getString("ongoingprojects_short_description"));
		onGoingProjectInfo.setLong_description(rs.getString("ongoingprojects_long_description"));
		
		String[] technology = rs.getString("ongoingprojects_technologies_used").split(", ");
		for(int i = 0; i<technology.length; i++)
		{	
			technologies_used.add(technology[i]);		
		}
		onGoingProjectInfo.setTechnologies_used(technologies_used);
		
		String[] tool = rs.getString("ongoingprojects_tools").split(", ");
		for(int i = 0; i<tool.length; i++)
		{	
			tools.add(tool[i]);		
		}
		onGoingProjectInfo.setTools(tools);
		
		String[] team = rs.getString("ongoingprojects_project_team").split(", ");
		for(int i = 0; i<team.length; i++)
		{	
 			pteam = new ProjectTeam();
 			str = team[i].split("~");
			pteam.setName(str[0]);
			pteam.setDesig(str[1]);
			projectTeam.add(pteam);	
		}
		onGoingProjectInfo.setProject_team(projectTeam);
		onGoingProjectInfo.setDomain(rs.getString("ongoingprojects_domain"));
		onGoingProjectInfo.setDuration_release(rs.getString("ongoingprojects_duration_release"));
		onGoingProjectInfo.setProgress(rs.getString("ongoingprojects_progress"));
		onGoingProjectInfo.setProject_id(rs.getString("projects_id"));
		return onGoingProjectInfo;
	}
}
