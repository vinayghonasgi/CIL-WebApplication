package com.hcl.cil.model;

import org.springframework.stereotype.Service;

@Service
public class ForgotUser 
{
	private String username;
	
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
}
