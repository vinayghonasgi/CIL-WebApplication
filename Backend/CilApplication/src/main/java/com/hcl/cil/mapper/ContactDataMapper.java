package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

import com.hcl.cil.model.Contact;

public class ContactDataMapper implements RowMapper<Contact>
{

	@Override
	public Contact mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		ArrayList<String> contact_list = new ArrayList<>();
		Contact contactInfo = new Contact();
		contactInfo.setContact_mainheading(rs.getString("contact_heading"));
		
		String[] list = rs.getString("contact_list").split("~");
		for(int i = 0; i<list.length; i++)
		{
			contact_list.add(list[i]);
		}
		
		contactInfo.setContact_info(contact_list);
		contactInfo.setContact_subheading(rs.getString("contact_subheading"));
		return contactInfo;
	}
}
