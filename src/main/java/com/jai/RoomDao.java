package com.jai;

import org.springframework.jdbc.core.JdbcTemplate;

public class RoomDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
			this.template = template;
		}
	
	public int save(Room r) {
		String sql = "insert into room() values('"+r.getRoomName()+"','"+r.getRoomNo()+"','"+r.getBuilding()+"','"+r.getFloor()+"')";
		return template.update(sql);
	}
}
