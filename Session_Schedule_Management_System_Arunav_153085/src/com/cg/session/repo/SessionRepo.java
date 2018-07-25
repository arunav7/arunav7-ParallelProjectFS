package com.cg.session.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.session.beans.ScheduledSessions;
import com.cg.session.exception.ScheduledSessionException;

public interface SessionRepo extends JpaRepository<ScheduledSessions, Integer> {

	
}
