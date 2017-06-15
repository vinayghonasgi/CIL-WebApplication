package com.hcl.cil.model;

import java.util.ArrayList;

public class Contact 
{
	private String contact_mainheading;
	private String contact_subheading;
	private ArrayList<String> contact_info;
	public String getContact_mainheading() {
		return contact_mainheading;
	}
	public void setContact_mainheading(String contact_mainheading) {
		this.contact_mainheading = contact_mainheading;
	}
	public String getContact_subheading() {
		return contact_subheading;
	}
	public void setContact_subheading(String contact_subheading) {
		this.contact_subheading = contact_subheading;
	}
	public ArrayList<String> getContact_info() {
		return contact_info;
	}
	public void setContact_info(ArrayList<String> contact_info) {
		this.contact_info = contact_info;
	}
	
	
}
