package org.assignment.junit.JunitAssignment;

import javax.persistence.Embeddable;

@Embeddable
public class SubjectMarks {

	private String subject;
	private int marks;
	
	
	public SubjectMarks(String subject, int marks) {
		super();
		this.subject = subject;
		this.marks = marks;
	}
	
	
	
}
