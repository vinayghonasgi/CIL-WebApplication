package com.hcl.cil.model;

import org.springframework.stereotype.Service;

@Service
public class ProjectIdRequest 
{
	private int id;

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}
}
