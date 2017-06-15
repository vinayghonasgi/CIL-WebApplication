package com.hcl.cil.model;

import java.util.ArrayList;

public class Services 
{
	private  String service_mainheading;
	private  ArrayList<ServicesData> service_offering;
	public String getService_mainheading() {
		return service_mainheading;
	}
	public void setService_mainheading(String service_mainheading) {
		this.service_mainheading = service_mainheading;
	}
	public ArrayList<ServicesData> getService_offering() {
		return service_offering;
	}
	public void setService_offering(ArrayList<ServicesData> service_offering) {
		this.service_offering = service_offering;
	}
	
	
}
