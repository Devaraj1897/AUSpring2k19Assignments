package org.assignment.junit.JunitAssignment;

import java.util.List;

public interface StudentDao {

	public List<Student> getAllStudents();	
	public String saveStudent(Student student);
	public List<StudentResult> getResultList();
	//public int generateTotalMarks();
}

