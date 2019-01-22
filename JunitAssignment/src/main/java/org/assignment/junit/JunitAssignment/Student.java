package org.assignment.junit.JunitAssignment;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Student {
	@Id
	@GeneratedValue
	private int studentCode;
	private String studentName;
	private String studentDOB;
	@ElementCollection
	private List<SubjectMarks> marks;
	@OneToOne
	private StudentResult result;
	
	public Student() {
		super();
	}
	public Student(String studentName, String studentDOB, List<SubjectMarks> marks) {
		super();
		this.studentName = studentName;
		this.studentDOB = studentDOB;
		this.marks = marks;
	}
	public int getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(String studentDOB) {
		this.studentDOB = studentDOB;
	}
	public List<SubjectMarks> getMarks() {
		return marks;
	}
	public void setMarks(List<SubjectMarks> marks) {
		this.marks = marks;
	}
	public StudentResult getResult() {
		return result;
	}
	public void setResult(StudentResult result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student [Id=" + studentCode + ", Name=" + studentName + ", DOB=" + studentDOB
				+ "]\n";
	}
	
	
	
	

}
