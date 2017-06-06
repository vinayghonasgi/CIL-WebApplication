package com.hcl.cil.model;


import org.springframework.stereotype.Service;

@Service
public class ChangePass 
{
	private String newpass;
	private String confirmpass;
	
	public String getNewpass() 
	{
		return newpass;
	}
	public void setNewpass(String newpass) 
	{
		this.newpass = newpass;
	}
	public String getConfirmpass() 
	{
		return confirmpass;
	}
	public void setConfirmpass(String confirmpass) 
	{
		this.confirmpass = confirmpass;
	}
}
