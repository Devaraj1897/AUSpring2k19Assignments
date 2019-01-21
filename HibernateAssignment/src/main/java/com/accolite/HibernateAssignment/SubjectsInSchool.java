package com.accolite.HibernateAssignment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SubjectsInSchool {
	
	@Id
	@GeneratedValue
	private int subjectId;
	
	private String subjectName;
	
	
	

	public SubjectsInSchool() {
		super();
	}
	
	

	public SubjectsInSchool(int subjectId, String subjectName) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
	}



	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + "]";
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	
	

}
