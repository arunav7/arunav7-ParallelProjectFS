package com.cg.session.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.session.beans.ScheduledSessions;

@Controller
public class URIController {
  
	@RequestMapping(value="/")
	public String getIndexPage() {
		return "index";
	}
	
	@RequestMapping(value="/successSpring") 
	public String getSpringPage() {
		return "springPage";
	}
	
	@RequestMapping(value="/successStruts") 
	public String getStrutsPage() {
		return "strutsPage";
	}
	
	@RequestMapping(value="/successHibernate") 
	public String getHibernatePage() {
		return "hibernatePage";
	}
	
	@ModelAttribute(value="scheduledSession")
	public ScheduledSessions getSession() {
		return new ScheduledSessions();
	}
}
