package com.hcl.cil.model;

import org.springframework.stereotype.Service;

@Service
public class UserRefresh 
{
	private String response;
	private String token;

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
