package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

import com.hcl.cil.model.Contact;

public class ContactDataMapper implements RowMapper<Contact>
{
	private ArrayList<String> contact_list;

	@Override
	public Contact mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		contact_list = new ArrayList<String>();
		Contact contactInfo = new Contact();
		contactInfo.setId(rs.getString("contact_id"));
		contactInfo.setMain(rs.getString("contact_heading"));
		
		String[] list = rs.getString("contact_list").split("~");
		for(int i = 0; i<list.length; i++)
		{
			contact_list.add(list[i]);
		}
		
		contactInfo.setList(contact_list);
		contactInfo.setSub(rs.getString("contact_subheading"));
		return contactInfo;
	}
}
