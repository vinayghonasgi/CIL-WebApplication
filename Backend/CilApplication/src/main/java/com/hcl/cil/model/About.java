package com.hcl.cil.model;

import java.util.ArrayList;

public class About 
{
	private  String about_mainheading;
	private  String about_description;
	private  String about_subheading;	
	private  ArrayList<String> about_info;
	public String getAbout_mainheading() {
		return about_mainheading;
	}
	public void setAbout_mainheading(String about_mainheading) {
		this.about_mainheading = about_mainheading;
	}
	public String getAbout_description() {
		return about_description;
	}
	public void setAbout_description(String about_description) {
		this.about_description = about_description;
	}
	public String getAbout_subheading() {
		return about_subheading;
	}
	public void setAbout_subheading(String subheading) {
		this.about_subheading = subheading;
	}
	public ArrayList<String> getAbout_info() {
		return about_info;
	}
	public void setAbout_info(ArrayList<String> about_info) {
		this.about_info = about_info;
	}
	
		
}
