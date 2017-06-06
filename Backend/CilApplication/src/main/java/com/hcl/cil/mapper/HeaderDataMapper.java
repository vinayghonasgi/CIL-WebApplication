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
		headerInfo.setId(rs.getString("header_id"));
		headerInfo.setMain(rs.getString("header_heading"));
		headerInfo.setSub(rs.getString("header_subheading"));
		headerInfo.setDesc(rs.getString("header_description"));
		headerInfo.setImg(rs.getString("header_img"));
		
		return headerInfo;
	}
}
