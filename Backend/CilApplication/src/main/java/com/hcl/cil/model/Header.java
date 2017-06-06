package com.hcl.cil.model;

public class Header 
{
	private  String id;
	private  String main;  
	private  String sub;
	private  String desc;
	private  String img;
	
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getMain() 
	{
		return main;
	}
	public void setMain(String main) 
	{
		this.main = main;
	}
	public String getSub() 
	{
		return sub;
	}
	public void setSub(String subHeading) 
	{
		this.sub = subHeading;
	}
	public String getDesc() 
	{
		return desc;
	}
	public void setDesc(String desc) 
	{
		this.desc = desc;
	}
	public String getImg() 
	{
		return img;
	}
	public void setImg(String img) 
	{
		this.img = img;
	}
	
}
