package com.hcl.cil.model;

import java.util.List;

public class Content 
{
	private Header header;
	private Values values;
	private Services service;
	private About about;
	private Success success;
	private List<Strategic> strategic;
	private Contact contact;
	
	public Header getHeader() 
	{
		return header;
	}
	public void setHeader(Header header) 
	{
		this.header = header;
	}

	public Values getValues() 
	{
		return values;
	}
	public void setValues(Values values) 
	{
		this.values = values;
	}

	public Services getService() 
	{
		return service;
	}
	public void setService(Services service) 
	{
		this.service = service;
	}

	public About getAbout() 
	{
		return about;
	}
	public void setAbout(About about) 
	{
		this.about = about;
	}

	public Success getSuccess() 
	{
		return success;
	}
	public void setSuccess(Success success) 
	{
		this.success = success;
	}

	public List<Strategic> getStrategic() 
	{
		return strategic;
	}
	public void setStrategic(List<Strategic> strategic) 
	{
		this.strategic = strategic;
	}

	public Contact getContact() 
	{
		return contact;
	}
	public void setContact(Contact contact) 
	{
		this.contact = contact;
	}
}
