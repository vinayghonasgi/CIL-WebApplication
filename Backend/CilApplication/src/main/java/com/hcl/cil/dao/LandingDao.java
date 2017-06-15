package com.hcl.cil.dao;

import java.util.List;

import com.hcl.cil.model.*;

public interface LandingDao
{
	public List<Strategic> getStrategicData();
	public Header getHeaderData();
	public Values getValuesData();	
	public Services getServiceData();
	public About getAboutData();
	public Success getSuccessData();
	public Contact getContactData();
}
