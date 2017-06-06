package com.hcl.cil.model;

import java.util.ArrayList;

public class Values 
{
	private  String id = "Co-Innovation lab";
	private  String main;
	private  ArrayList<String> list = new ArrayList<String>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public ArrayList<String> getList() {
		return list;
	}
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	
	
}
