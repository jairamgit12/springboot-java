package com.jai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RoomController {
	
	@Autowired
	RoomDao dao;
	
	@RequestMapping("/roomform")
	public String viewForm(Model m) {
		Room r = new Room();
		m.addAttribute("room",r);
		return "roomform";
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String insert(@ModelAttribute("room") Room room) {
		dao.save(room);
		return "roomform";
	}
	

}
