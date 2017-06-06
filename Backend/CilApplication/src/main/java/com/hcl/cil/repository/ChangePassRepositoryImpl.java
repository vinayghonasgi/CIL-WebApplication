package com.hcl.cil.repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.hcl.cil.model.ChangePass;
import com.hcl.cil.model.HeaderUser;
import com.hcl.cil.model.UserResponse;

@Repository
public class ChangePassRepositoryImpl implements ChangePassDao
{
	
	private JdbcTemplate template;

	@Autowired
	private DataSource dataSource;
		
	@Autowired
	private UserResponse userResponse;

	@PostConstruct
	public void init() 
	{
		template = new JdbcTemplate();
		template.setDataSource(dataSource);
	}

	@Override
	public UserResponse getChangePassResponseData(HeaderUser cookieUser, ChangePass changepass) 
	{
		SqlRowSet Rs = template.queryForRowSet("SELECT * FROM userdetails WHERE userdetail_username = '" + cookieUser.getUsername() + "'");
		if (Rs.next()) 
		{
			if(changepass.getNewpass().equals(changepass.getConfirmpass()) == true)
			{
				template.update("UPDATE userdetails set userdetail_password = '" + changepass.getConfirmpass() + "' where userdetail_username = '" + cookieUser.getUsername() + "'");
				userResponse.setResponse("TRUE");
				return userResponse;
			}
			else
			{
				userResponse.setResponse("FALSE");
				return userResponse;
			}
		} 
		else 
		{
			userResponse.setResponse("FALSE");
			return userResponse;
		}
	}
}
