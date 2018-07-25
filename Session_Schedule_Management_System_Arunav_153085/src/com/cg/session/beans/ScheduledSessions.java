package com.cg.session.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="scheduledsessions")
public class ScheduledSessions {

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	
	public void setId(Integer id) {
		this.id = id;
	}

	String name;
	Double duration;
	String faculty, mode1;
	
	public ScheduledSessions() {
		super();
	}
	
	public Integer getId() {
		return id;
	}

	public ScheduledSessions(String name, Double duration, String faculty, String mode1) {
		this.name = name;
		this.duration = duration;
		this.faculty = faculty;
		this.mode1 = mode1;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getDuration() {
		return duration;
	}
	
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	
	public String getFaculty() {
		return faculty;
	}
	
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	public String getMode1() {
		return mode1;
	}
	
	public void setMode1(String mode1) {
		this.mode1 = mode1;
	}
	
	@Override
	public String toString() {
		return "ScheduledSessions [id=" + id + ", name=" + name + ", duration=" + duration + ", faculty=" + faculty
				+ ", mode1=" + mode1 + "]";
	}	
}
