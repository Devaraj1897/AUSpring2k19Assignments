package org.assignment.junit.JunitAssignment;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		//====================================================================================================
		//Populating the Database with Students and Marks(Randomly)	
		/*
		SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory();
		int a;
		String dates[]= {"1996-10-2","1997-11-21","1997-2-24","1997-8-24","1997-12-23","1997-12-18","1998-7-7",
				"1996-5-22","1997-1-18","1997-8-1","1997-9-7","1997-10-23","1997-1-28","1997-12-22","1997-7-18",
				"1997-11-14","1997-9-5","1996-3-1","1996-4-1","1997-9-5","1998-2-28","1997-1-30","1997-8-31",
				"1997-12-31","1997-5-24","1997-6-5","1997-6-2","1997-11-13","1997-2-2","1997-2-11","1997-2-9"};
		for (int i = 0;i<26; i++) {
			List<SubjectMarks> subjects = new ArrayList();
			a=(int)(Math.random()*100);
			subjects.add(new SubjectMarks("Maths",a));
			a=(int)(Math.random()*100);
			subjects.add(new SubjectMarks("Science",a));
			a=(int)(Math.random()*100);
			subjects.add(new SubjectMarks("Computer",a));
			Student s = new Student((char)(i+65)+"",dates[i], subjects);
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(s);
			tx.commit();
			session.close();
		}*/
		//=====================================================================================================
		
		StudentDao dao=new StudentDaoImpl();
		dao.generateTotalMarks();
		
	}

}
