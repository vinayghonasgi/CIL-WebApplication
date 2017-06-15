 package com.hcl.cil.model;

import java.util.ArrayList;

public class Values 
{
	private  String id = "Co-Innovation lab";
	private  String values_mainheading;
	private  ArrayList<ValuesData> values_info;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getValues_mainheading() {
		return values_mainheading;
	}
	public void setValues_mainheading(String values_mainheading) {
		this.values_mainheading = values_mainheading;
	}
	public ArrayList<ValuesData> getValues_info() {
		return values_info;
	}
	public void setValues_info(ArrayList<ValuesData> values_info) {
		this.values_info = values_info;
	}
	
	
}
