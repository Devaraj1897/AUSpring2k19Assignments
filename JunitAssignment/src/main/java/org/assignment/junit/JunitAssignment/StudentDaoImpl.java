package org.assignment.junit.JunitAssignment;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.mysql.cj.xdevapi.Result;

public class StudentDaoImpl implements StudentDao {
	SessionFactory factory;
	public StudentDaoImpl() {
		factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory();
	}

	public int getAllStudents() {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		List<Student> students=(List<Student>) session.createQuery("FROM Student").getResultList();
		//System.out.println(students);
		tx.commit();
		session.close();
		return students.size();
	}

	public String saveStudent(Student student) {		
		return null;
	}

	public Student getTopper() {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		List<Student> students=(List<Student>) session.createQuery("FROM Student").getResultList();
		List<StudentResult> resultlist=session.createQuery("FROM StudentResult studentrank").getResultList();
		Iterator itstud=students.iterator();
		Iterator itres=resultlist.iterator();
		Student s=null;
		StudentResult sr=(StudentResult) itres.next();
		while(itstud.hasNext()) {
			s=(Student) itstud.next();
			if(s.getResult().getId()==sr.getId()) {
				break;
			}
		}
		return s;
	}

	public List<StudentResult> getResultList() {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		List<StudentResult> resultlist=session.createQuery("FROM StudentResult ORDER BY studentrank").getResultList();
		return resultlist;
	}

	public int generateTotalMarks() {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		List<Student> students=(List<Student>) session.createQuery("FROM Student").getResultList();
		if(students.isEmpty())
			throw new NoMarksException("Marks not updated");
		Iterator itstud=students.iterator();
		Student s=null;
		while(itstud.hasNext()) {
			int sum=0;
			s=(Student) itstud.next();
			StudentResult res=new StudentResult();
			Iterator itmarks=s.getMarks().iterator();
			SubjectMarks sm=null;
			while(itmarks.hasNext()) {
				sm=(SubjectMarks) itmarks.next();
				sum+=sm.getMarks();
			}
			res.setTotalMarks(sum);
			res.setDob(s.getStudentDOB());
			session.save(res);
			s.setResult(res);
			session.save(s);
		}
		tx.commit();
		session.close();
		return generateRanks();
	}

	public int generateRanks() {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		List<StudentResult> students=(List<StudentResult>) session.createQuery("FROM StudentResult ORDER BY studenttotalMarks DESC,dob").getResultList();
		
		//Query query=(Query) session.createSQLQuery("SELECT {sr.*} FROM Student AS s INNER JOIN StudentResult AS sr ON ORDER BY sr.studenttotalMarks,s.studentDOB DESC").getResultList();
		
		System.out.println(students);
		int i=1,max=0;
		session.createSQLQuery("DROP TABLE StudentResult");
		Iterator it=students.iterator();
		StudentResult res=null;
		while(it.hasNext()) {
			res=(StudentResult) it.next();
			if(i==1)
				max=res.getTotalMarks();
			res.setRank(i++);
			int percent=(int)(res.getTotalMarks()*100)/max;
			res.setPercentile(percent);
			session.save(res);
		}
		tx.commit();
		session.close();
		return max;
	}



}
