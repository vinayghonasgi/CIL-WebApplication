package com.hcl.cil.model;

import org.springframework.stereotype.Service;

@Service
public class Auth 
{
	private String email;
	private String user;
	private String role;
	private String status;
	private String response;
	private String token;
	
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getUser() 
	{
		return user;
	}
	public void setUser(String user) 
	{
		this.user = user;
	}		
	public String getStatus() 
	{
		return status;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}
	
	public String getRole() 
	{
		return role;
	}
	public void setRole(String role) 
	{
		this.role = role;
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
