package com.hcl.cil.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class SecurityDetails 
{
	private String username;
	private String firstname;
	private String lastname;
	private Map<String,String> questions = new HashMap<String,String>();
	private String response;
	private String token;
	
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getFirstname() 
	{
		return firstname;
	}
	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}
	public String getLastname() 
	{
		return lastname;
	}
	public void setLastname(String lastname) 
	{
		this.lastname = lastname;
	}
	public Map<String, String> getQuestions() 
	{
		return questions;
	}
	public void setQuestions(Map<String, String> questions)
	{
		this.questions = questions;
	}
	public String getResponse() 
	{
		return response;
	}
	public void setResponse(String response) 
	{
		this.response = response;
	}
	public String getToken() 
	{
		return token;
	}
	public void setToken(String token) 
	{
		this.token = token;
	}
	
}
