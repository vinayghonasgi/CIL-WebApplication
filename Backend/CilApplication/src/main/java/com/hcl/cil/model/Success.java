package com.hcl.cil.model;

import java.util.ArrayList;

public class Success 
{
	private  String success_mainheading;
	private  String success_subheading;
	private  ArrayList<SuccessData> success_info;
	
	public String getSuccess_mainheading() {
		return success_mainheading;
	}
	public void setSuccess_mainheading(String success_mainheading) {
		this.success_mainheading = success_mainheading;
	}
	public String getSuccess_subheading() {
		return success_subheading;
	}
	public void setSuccess_subheading(String success_subheading) {
		this.success_subheading = success_subheading;
	}
	public ArrayList<SuccessData> getSuccess_info() {
		return success_info;
	}
	public void setSuccess_info(ArrayList<SuccessData> success_info) {
		this.success_info = success_info;
	}
		
}
