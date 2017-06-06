package com.hcl.cil.repository;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hcl.cil.mapper.AboutDataMapper;
import com.hcl.cil.mapper.ContactDataMapper;
import com.hcl.cil.mapper.HeaderDataMapper;
import com.hcl.cil.mapper.ServiceDataMapper;
import com.hcl.cil.mapper.StrategicDataMapper;
import com.hcl.cil.mapper.SuccessDataMapper;
import com.hcl.cil.mapper.ValuesDataMapper;
import com.hcl.cil.model.About;
import com.hcl.cil.model.Contact;
import com.hcl.cil.model.Header;
import com.hcl.cil.model.Services;
import com.hcl.cil.model.Strategic;
import com.hcl.cil.model.Success;
import com.hcl.cil.model.Values;

@Repository
public class LandingRepositoryImpl implements LandingDao
{	
	private JdbcTemplate template;
	
	@Autowired
	private DataSource dataSource;
	
	@PostConstruct
	public void init()
	{
		template = new JdbcTemplate();
		template.setDataSource(dataSource);	
	}
	
	private final String SELECT_ABOUT 		= "SELECT * FROM about 		WHERE about_id		= (SELECT MAX(about_id) 	FROM about)";
	private final String SELECT_CONTACT 	= "SELECT * FROM contact 	WHERE contact_id	= (SELECT MAX(contact_id) 	FROM contact)";
	private final String SELECT_HEADER 		= "SELECT * FROM header 	WHERE header_id		= (SELECT MAX(header_id) 	FROM header)";
	private final String SELECT_SERVICE 	= "SELECT * FROM service 	WHERE service_id	= (SELECT MAX(service_id) 	FROM service)";
	private final String SELECT_SUCCESS 	= "SELECT * FROM success 	WHERE success_id	= (SELECT MAX(success_id) 	FROM success)";
	private final String SELECT_VALUES 		= "SELECT * FROM keyvalues 	WHERE keyvalues_id	= (SELECT MAX(keyvalues_id) FROM keyvalues)";
	private final String SELECT_STRATEGIC	= "SELECT * FROM strategic 	WHERE strategic_status = 'active'";
	
	@Override
	public Header getHeaderData() 
	{
		return  template.queryForObject(SELECT_HEADER,new HeaderDataMapper());
	}
	
	@Override
	public Contact getContactData() 
	{
		return  template.queryForObject(SELECT_CONTACT,new ContactDataMapper());
	}
	
	@Override
	public About getAboutData()
	{
		return  template.queryForObject(SELECT_ABOUT,new AboutDataMapper());
	}
	
	@Override
	public Services getServiceData() 
	{
		return  template.queryForObject(SELECT_SERVICE,new ServiceDataMapper());
	}
	
	@Override
	public List<Strategic> getStrategicData() 
	{
		List<Strategic> strategic  = template.query(SELECT_STRATEGIC,new StrategicDataMapper());
		return strategic;
	}
	
	@Override
	public Success getSuccessData() 
	{
		return  template.queryForObject(SELECT_SUCCESS,new SuccessDataMapper());
	}
	
	@Override
	public Values getValuesData() 
	{
		return  template.queryForObject(SELECT_VALUES,new ValuesDataMapper());
	}
}
