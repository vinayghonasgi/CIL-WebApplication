package com.hcl.cil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.hcl.cil.model.HclEventList;

public class EventsDataMapper implements RowMapper<HclEventList>
{  
	@Override
	public HclEventList mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		HclEventList eventsInfo = new HclEventList();
		eventsInfo.setEvent_id(rs.getInt("event_id"));
		eventsInfo.setEvent_name(rs.getString("event_name"));
		eventsInfo.setEvent_venue(rs.getString("event_venue"));
		eventsInfo.setEvent_time(rs.getString("event_time"));
		eventsInfo.setEvent_date(rs.getString("event_date"));
		eventsInfo.setEvent_presenter(rs.getString("event_presenter"));
		eventsInfo.setEvent_audience(rs.getString("event_audience"));
		eventsInfo.setEvent_agenda(rs.getString("event_agenda"));
		eventsInfo.setEvent_status(rs.getString("event_status"));
		return eventsInfo;
	}
}
