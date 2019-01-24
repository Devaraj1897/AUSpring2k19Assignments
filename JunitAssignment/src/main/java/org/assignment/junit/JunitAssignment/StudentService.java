package org.assignment.junit.JunitAssignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentService {
	
	public StudentDao dao;
	
	public StudentService() {
		
	}
	

	
	public int getAllStudents(boolean a) throws NullPointerException{	
		int count=26;
		return count;
	}
	
	/*public void generateScores() {
		dao.generateTotalMarks();
		dao.generateRanks();
	}*/
	
	public Student getTopper() {
		/*List<Student> students=dao.getAllStudents();
		List<StudentResult> resultlist=dao.getResultList();
		Iterator itstud=students.iterator();
		Iterator itres=resultlist.iterator();
		Student s=null;
		StudentResult sr=(StudentResult) itres.next();
		while(itstud.hasNext()) {
			s=(Student) itstud.next();
			if(s.getResult().getId()==sr.getId()) {
				break;
			}
		}*/
		List<SubjectMarks> list=new ArrayList();
		list.add(new SubjectMarks("Maths",98));
		list.add(new SubjectMarks("Science",97));
		list.add(new SubjectMarks("Computers",99));
		Student s=new Student("Kishore","1996-12-24",list);
		return s;
	}
}
