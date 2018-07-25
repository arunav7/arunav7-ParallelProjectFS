package com.cg.session.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.session.beans.ScheduledSessions;
import com.cg.session.exception.ScheduledSessionException;
import com.cg.session.repo.SessionRepo;

@Component(value="sessionService")
public class SessionServiceImpl implements SessionService {

	@Autowired
	SessionRepo sessionRepo;
	
	@Override
	public ScheduledSessions displaySessions(Integer id) throws ScheduledSessionException {
		
		ScheduledSessions session = sessionRepo.findOne(id);
		
		return sessionRepo.save(session);
	}

	
}
