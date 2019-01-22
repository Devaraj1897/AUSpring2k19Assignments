package org.assignment.junit.JunitAssignment;

import java.util.List;

public interface StudentDao {

	public int getAllStudents();	
	public String saveStudent(Student student);
	public Student getTopper();
	public List<StudentResult> getResultList();
	public int generateTotalMarks();
	public int generateRanks();
	
}

