package com.factorymethod.assignment.FactoryMethodAssignment;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class FactoryMethodTester {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		Student stud = ctx.getBean("stud", Student.class);
		
		stud.printAddress("#168, 2nd main, dollars colony, balaji temple, bangalore-91");
		
		ctx.close();
	}

}

