package com.cg.session.service;

import com.cg.session.beans.ScheduledSessions;
import com.cg.session.exception.ScheduledSessionException;

public interface SessionService {

	public ScheduledSessions displaySessions(Integer id) throws ScheduledSessionException;
	
}
