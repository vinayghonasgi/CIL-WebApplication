package com.hcl.cil.security;

import org.springframework.stereotype.Service;

@Service
public class AuthJWT 
{
	private String authJwtEncryp;

	public String getAuthJwtEncryp() 
	{
		return authJwtEncryp;
	}

	public void setAuthJwtEncryp(String authJwtEncryp) 
	{
		this.authJwtEncryp = authJwtEncryp;
	}
	
}
