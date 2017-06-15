package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hcl.cil.model.Header;

public class HeaderDataMapper implements RowMapper<Header>
{
	@Override
	public Header mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		Header headerInfo = new Header();
		headerInfo.setHeader_mainheading(rs.getString("header_heading"));
		headerInfo.setHeader_subheading(rs.getString("header_subheading"));
		headerInfo.setHeader_description(rs.getString("header_description"));		
		return headerInfo;
	}
}
