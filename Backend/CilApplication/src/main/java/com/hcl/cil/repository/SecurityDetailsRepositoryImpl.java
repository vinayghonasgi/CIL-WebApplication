package com.hcl.cil.repository;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;
import com.hcl.cil.model.ForgotUser;
import com.hcl.cil.model.SecurityDetails;

@Repository
public class SecurityDetailsRepositoryImpl implements SecurityDetailsDao
{
	private Map<String,String> questions = new HashMap<String,String>();
	
	private JdbcTemplate template;

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SecurityDetails securityDetails;

	@PostConstruct
	public void init() 
	{
		template = new JdbcTemplate();
		template.setDataSource(dataSource);
	}
	@Override
	public SecurityDetails getSecurityDetailsData(ForgotUser fuser) 
	{
		SqlRowSet Rs = template.queryForRowSet("SELECT * FROM userdetails WHERE userdetail_username = '" + fuser.getUsername() + "'");
		if (Rs.next()) 
		{
			securityDetails.setUsername(Rs.getString("userdetail_username"));
			securityDetails.setFirstname(Rs.getString("userdetail_firstname"));
			securityDetails.setLastname(Rs.getString("userdetail_lastname"));
			questions.put(Rs.getString("userdetail_securityq1"), Rs.getString("userdetail_answerq1"));
			questions.put(Rs.getString("userdetail_securityq2"), Rs.getString("userdetail_answerq2"));
			questions.put(Rs.getString("userdetail_securityq3"), Rs.getString("userdetail_answerq3"));
			securityDetails.setQuestions(questions);
			securityDetails.setResponse("TRUE");
			return securityDetails;
		} 
		else 
		{
			securityDetails.setUsername(null);
			securityDetails.setFirstname(null);
			securityDetails.setLastname(null);
			securityDetails.setQuestions(null);
			securityDetails.setResponse("FALSE");
			return securityDetails;
		}
	}
}
