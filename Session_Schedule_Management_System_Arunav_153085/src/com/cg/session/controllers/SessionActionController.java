package com.cg.session.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.session.beans.ScheduledSessions;
import com.cg.session.exception.ScheduledSessionException;
import com.cg.session.service.SessionService;

@Controller
public class SessionActionController {

	@Autowired
	SessionService sessionService;
	
	@RequestMapping(value="/loginAdmin")
	public ModelAndView getAdmin(@RequestParam("username") String userName, @RequestParam("password") String password) {
		
		if(userName.equals("admin") && password.equals("admin"))
			return new ModelAndView("scheduledSessions");
		
		else
			return new ModelAndView("errorPage");
	}
	
	@RequestMapping(value="/spring")
	public ModelAndView getSpring(@ModelAttribute("scheduledSession") ScheduledSessions session) {
		
		try {
			session.setId(1);
			session = sessionService.displaySessions(session.getId());
			
			return new ModelAndView("springPage","scheduledSession",session);
		} catch (ScheduledSessionException e) {
			return new ModelAndView("errorPage");
		}
	}
	
	@RequestMapping(value="/struts")
	public ModelAndView getStruts(@ModelAttribute("scheduledSession") ScheduledSessions session) {
		
		try {
			session.setId(2);
			session = sessionService.displaySessions(session.getId());
			
			return new ModelAndView("strutsPage","scheduledSession",session);
		} catch (ScheduledSessionException e) {
			return new ModelAndView("errorPage");
		}
	}
	
	@RequestMapping(value="/hibernate")
	public ModelAndView getHibernate(@ModelAttribute("scheduledSession") ScheduledSessions session) {
		
		try {
			session.setId(3);
			session = sessionService.displaySessions(session.getId());
			
			return new ModelAndView("hibernatePage","scheduledSession",session);
		} catch (ScheduledSessionException e) {
			return new ModelAndView("errorPage");
		}
	}
}
