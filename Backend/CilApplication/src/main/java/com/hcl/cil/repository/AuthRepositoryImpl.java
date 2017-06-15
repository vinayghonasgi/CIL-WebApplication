package com.hcl.cil.repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.hcl.cil.dao.AuthDao;
import com.hcl.cil.model.Auth;
import com.hcl.cil.model.User;

@Repository
public class AuthRepositoryImpl implements AuthDao {
	private JdbcTemplate template;

	@Autowired
	private Auth auth;

	@Autowired
	private DataSource dataSource;

	
	@PostConstruct
	public void init() 
	{
		template = new JdbcTemplate();
		template.setDataSource(dataSource);
	}

	@Override
	public Auth getAuthenticatioData(User user) 
	{
		SqlRowSet Rs = template.queryForRowSet("SELECT * FROM userdetails WHERE userdetail_username "
		+ " = '" + user.getUsername() + "' and userdetail_password = '" + user.getPassword() + "'");
		if (Rs.next()) 
		{
			auth.setEmail(Rs.getString("userdetail_email"));
			auth.setUser(Rs.getString("userdetail_username"));
			auth.setRole(Rs.getString("userdetail_role"));
			auth.setStatus(Rs.getString("userdetail_status"));
			auth.setResponse("TRUE");
			return auth;
		} else 
		{
			auth.setEmail(null);
			auth.setUser(null);
			auth.setRole(null);
			auth.setStatus(null);
			auth.setResponse("FALSE");
			return auth;
		}
	}
}
