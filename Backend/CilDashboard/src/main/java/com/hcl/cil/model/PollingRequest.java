package com.hcl.cil.model;

import org.springframework.stereotype.Service;

@Service
public class PollingRequest 
{
	private int id;
	private String options;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	
	
}
