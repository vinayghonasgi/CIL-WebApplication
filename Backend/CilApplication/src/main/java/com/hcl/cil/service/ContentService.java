package com.hcl.cil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.cil.dao.LandingDao;
import com.hcl.cil.model.*;

@Service
public class ContentService
{	
	@Autowired
	private LandingDao repository;
	
	public Content getContent()
	{
		Content contents = new Content();
		List<Strategic> strategicInfo 	= repository.getStrategicData();
		Header headerData 				= repository.getHeaderData();
		Values valuesInfo 				= repository.getValuesData();
		Services serviceInfo 			= repository.getServiceData();
		About aboutInfo 				= repository.getAboutData();
		Success successInfo 			= repository.getSuccessData();
		Contact contactInfo 			= repository.getContactData();
		
		contents.setStrategic(strategicInfo);
		contents.setHeader(headerData);
		contents.setValues(valuesInfo);
		contents.setService(serviceInfo);
		contents.setAbout(aboutInfo);
		contents.setStrategic(strategicInfo);
		contents.setSuccess(successInfo);
		contents.setContact(contactInfo); 
		return contents;
	} 
}
