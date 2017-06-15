package com.hcl.cil.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PollingsResult 
{
	private  int qid;
	private  String qname;
	private  List<HashMap<String,String>> qoptions; 
	private  int total;
	
	public int getQid() 
	{
		return qid;
	}
	public void setQid(int qid) 
	{
		this.qid = qid;
	}
	public String getQname() 
	{
		return qname;
	}
	public void setQname(String qname) 
	{
		this.qname = qname;
	}
	public List<HashMap<String, String>> getQoptions() 
	{
		return qoptions;
	}
	public void setQoptions(List<HashMap<String, String>> qoptions) 
	{
		this.qoptions = qoptions;
	}
	public int getTotal() 
	{
		return total;
	}
	public void setTotal(int total) 
	{
		this.total = total;
	}
	
}
