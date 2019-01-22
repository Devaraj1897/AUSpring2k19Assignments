package org.assignment.junit.JunitAssignment;

import javax.persistence.Embeddable;

@Embeddable
public class SubjectMarks {

	private String subject;
	private int marks;
	
	public SubjectMarks() {
		super();
	}
	
	public SubjectMarks(String subject, int marks) {
		super();
		this.subject = subject;
		this.marks = marks;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
