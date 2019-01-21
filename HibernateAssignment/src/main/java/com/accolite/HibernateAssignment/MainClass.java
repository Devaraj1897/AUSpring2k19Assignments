package com.accolite.HibernateAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {

		Scanner sci = new Scanner(System.in);
		Scanner scs = new Scanner(System.in);
		SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory();
		do {
			System.out.println("CRUD Operations");
			System.out.println("1.Add Teacher");
			System.out.println("2.Retreive Teacher By Id");
			System.out.println("3.Get All Teachers");
			System.out.println("4.Retrieve Students handled by particular Teacher");
			System.out.println("5.Delete Teacher");
			System.out.println("Enter Choice:");
			Session session = factory.openSession();
			Transaction tx = (Transaction) session.beginTransaction();
			switch (sci.nextInt()) {
			case 1:
				System.out.println("Enter Teacher details:");
				Teacher t = new Teacher();
				System.out.println("Teacher Id:");
				t.setTeacherId(sci.nextInt());
				System.out.println("Teacher Name:");
				t.setTeacherName(scs.nextLine());
				System.out.println("Teacher Phone number:");
				t.setPhoneNumber(sci.nextInt());
				System.out.println("Teacher Address:");
				t.setAddress(scs.nextLine());
				System.out.println("Teacher Handling Subject:");
				System.out.println("Enter Subject Id and Subject Name");
				SubjectsInSchool r = new SubjectsInSchool(sci.nextInt(), scs.nextLine());
				session.save(r);
				t.setTeacherSubjectId(r);
				System.out.println("Enter Students");
				List<Student> studs = new ArrayList();
				do {
					System.out.println("Enter Student ID and Student Name:");
					Student s = new Student(sci.nextInt(), scs.nextLine());
					// session.save(s);
					studs.add(s);
					System.out.println("Do u want to another student?1-Yes 0-No");
				} while (sci.nextInt() == 1);
				t.setStudentsHandling(studs);
				session.save(t);
				break;
			case 2:
				System.out.println("Enter Teacher Id:");
				int id = sci.nextInt();
				List ters = session.createQuery(" FROM Teacher").getResultList();
				Iterator it = (Iterator) ters.iterator();
				Teacher teacher = null;
				while (it.hasNext()) {
					teacher = (Teacher) it.next();
					if (teacher.getTeacherId() == id) {
						break;
					}
				}
				System.out.println("FOUND");
				System.out.println(teacher);
				break;
			case 3:
				List teachers = session.createQuery(" FROM Teacher").getResultList();
				System.out.println(teachers);
				break;
			case 4:
				System.out.println("Enter Teacher Id:");
				int id2 = sci.nextInt();
				List ters2 = session.createQuery(" FROM Teacher").getResultList();
				Iterator it2 = (Iterator) ters2.iterator();
				Teacher teacher2 = null;
				while (it2.hasNext()) {
					teacher2 = (Teacher) it2.next();
					if (teacher2.getTeacherId() == id2) {
						break;
					}
				}
				System.out.println("FOUND");
				System.out.println(teacher2.getStudentsHandling());
				break;
			case 5:
				System.out.println("Enter Teacher Id:");
				int id3 = sci.nextInt();
				List ters3 = session.createQuery(" FROM Teacher").getResultList();
				Iterator it3 = (Iterator) ters3.iterator();
				Teacher teacher3 = null;
				while (it3.hasNext()) {
					teacher3 = (Teacher) it3.next();
					if (teacher3.getTeacherId() == id3) {
						break;
					}
				}
				System.out.println("Deleted");
				ters3.remove(teacher3);
				break;
			default:
				break;
			}
			tx.commit();
			session.close();
			System.out.println("Do you want to continue?1-Yes 0-No");
		} while (sci.nextInt() == 1);

		System.out.println("Ending main method");
	}

}
