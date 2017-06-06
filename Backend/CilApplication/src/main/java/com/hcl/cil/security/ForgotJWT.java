package com.hcl.cil.security;

import org.springframework.stereotype.Service;

@Service
public class ForgotJWT 
{
	private String forgotJwtEncryp;

	public String getForgotJwtEncryp() 
	{
		return forgotJwtEncryp;
	}

	public void setForgotJwtEncryp(String forgotJwtEncryp) 
	{
		this.forgotJwtEncryp = forgotJwtEncryp;
	}
	
}
