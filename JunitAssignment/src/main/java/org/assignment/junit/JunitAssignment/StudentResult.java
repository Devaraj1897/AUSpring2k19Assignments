package org.assignment.junit.JunitAssignment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity
public class StudentResult{
	@Id
	@GeneratedValue
	private int resultid;
	private int studenttotalMarks;
	private int studentrank;
	private int percentile;
	private String dob;
	
	public StudentResult() {
		super();
	}
	
	
	
	public int getId() {
		return resultid;
	}
	public void setId(int id) {
		this.resultid = id;
	}
	public int getTotalMarks() {
		return studenttotalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.studenttotalMarks = totalMarks;
	}
	public int getRank() {
		return studentrank;
	}
	public void setRank(int rank) {
		this.studentrank = rank;
	}


	public int getPercentile() {
		return percentile;
	}

	public void setPercentile(int percentile) {
		this.percentile = percentile;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	

}
