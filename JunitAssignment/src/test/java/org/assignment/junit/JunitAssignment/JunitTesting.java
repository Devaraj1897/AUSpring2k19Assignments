package org.assignment.junit.JunitAssignment;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;



/*import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
*/
public class JunitTesting {
	
	public StudentDaoImpl dao;
	public StudentDao StudentDaoMock;
	
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Setting up JUnit");
	}
	
	@Before
	public void setup() {
		dao=new StudentDaoImpl();
		StudentDaoMock=Mockito.mock(StudentDao.class);
	}
	
	@Test
	public void testSavingStudent() {
		
		List<SubjectMarks> list=new ArrayList();
		list.add(new SubjectMarks("Maths",98));
		list.add(new SubjectMarks("Science",97));
		list.add(new SubjectMarks("Computers",99));
		Student student=new Student("Aman","1996-1-24",list);
		Mockito.when(StudentDaoMock.saveStudent(student)).thenReturn("Added");
		String s=StudentDaoMock.saveStudent(student);
		assertEquals("Added",s);
	}
	
	@Test
	public void testgetAllStudents() {
		Mockito.when(StudentDaoMock.getAllStudents()).thenReturn(26);
		int count=dao.getAllStudents();
		assertEquals(count,StudentDaoMock.getAllStudents());
	}
	@Test(timeout=1000)
	public void testgetTopper() {
		Student s=dao.getTopper();
		assertEquals(s.getStudentName(),"A");
	}
	
	@Test
	public void testMaxTotalMarks() {
		int marks=dao.generateRanks();
		assertEquals(marks,236);
	}
	
	@Test(expected=NoMarksException.class)
	@Ignore
	public void testNoRecordsInDatabase() {
		dao.generateTotalMarks();
	}
	
	@After
	public void tearDown() {
		dao=null;
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("JUnit Test Completed");
	}
}
