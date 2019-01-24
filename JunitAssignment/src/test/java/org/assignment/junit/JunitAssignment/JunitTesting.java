package org.assignment.junit.JunitAssignment;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;


public class JunitTesting {
	
	public StudentService service;
	public StudentDao dao;
	
	
	@BeforeClass
	public static void beforeclass() { 
		System.out.println("Setting up JUnit");
	}
	
	@Before
	public void setup() {
		service=new StudentService();
		dao=Mockito.mock(StudentDao.class);
	}
	
	@Test
	public void testSavingStudent() {
		
		List<SubjectMarks> list=new ArrayList();
		list.add(new SubjectMarks("Maths",98));
		list.add(new SubjectMarks("Science",97));
		list.add(new SubjectMarks("Computers",99));
		Student student=new Student("Aman","1996-1-24",list);
		Mockito.when(dao.saveStudent(student)).thenReturn("Added");
		String s=dao.saveStudent(student);
		assertEquals("Added",s);
	}
	
	@Test
	public void testingGetAllStudents() {
		System.out.println();
		int count=service.getAllStudents(false);
		assertEquals(count,26);
	} 
	
	@Test(timeout=1000)
	public void testgetTopper() {
		Student s=service.getTopper(); 
		assertEquals(s.getStudentName(),"Kishore");
	}
	
	

	
	
	@Test
	public void testStudentResult() {
		StudentResult sr=new StudentResult();
		sr.setDob("12-12-1997");
		sr.setId(1231);
		sr.setPercentile(98);
		sr.setRank(2);
		sr.setTotalMarks(276);
		List<SubjectMarks> list=new ArrayList();
		list.add(new SubjectMarks("Maths",98));
		list.add(new SubjectMarks("Science",97));
		list.add(new SubjectMarks("Computers",99));
		Student s=new Student();
		s.setMarks(list);
		s.setStudentDOB("1-1-1997");
		s.setStudentName("tarun");
		s.setResult(sr);
		String sdob=s.getStudentDOB();
		String name=s.getStudentName();
		StudentResult result=s.getResult();
		List<SubjectMarks> m=s.getMarks();
		String dob=sr.getDob();
		int id=sr.getId();
		int p=sr.getPercentile();
		int k=sr.getRank();
		int r=sr.getTotalMarks();
		s.toString();
		
		assertEquals(dob,"12-12-1997");
		assertEquals(name,"tarun");
	}
	
	@After
	public void tearDown() {
		dao=null;
	}
	
	@AfterClass
	public static void afterclass() {
		System.out.println("JUnit Test Completed");
	}
}
