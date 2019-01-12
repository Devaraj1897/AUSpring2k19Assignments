package com.accolite.au.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Tester {
    static int count;
    static List<Manager> managers=new ArrayList();
	static List<Developer> developers=new ArrayList();
	public static void main(String[] args) {
		Scanner sci=new Scanner(System.in);
		Scanner scs=new Scanner(System.in);
		
		System.out.println("Accolite Employee Software");
		do {
		System.out.println("1.Add Employee");
		System.out.println("2.Remove Employee");
		System.out.println("3.Total Employees");
		System.out.println("4.Print all employess");
		switch(sci.nextInt()){
		case 1:do {
			      System.out.println("1.Add Manager");
			      System.out.println("2.Add Developer");
			      switch(sci.nextInt()){
			      case 1: Manager m=new Manager();
			              System.out.println("Enter the name:");
			              m.addName(scs.nextLine());
			              System.out.println("Enter the address");
			              m.setAddress(scs.nextLine());
			              System.out.println("Enter the email");
			              m.setEmail(scs.nextLine());
			              System.out.println("Enter the phone number");
			              m.setPh_no(scs.nextLine());
			              System.out.println("Enter the employee id");
			              m.setId(scs.nextLine());
			              managers.add(m);
			              System.out.println("Enter the managing department");
			              m.setManaging_department(scs.nextLine());
			              total_employess();
			              break;
			      case 2: Developer d= new Developer();
			              System.out.println("Enter the name:");
	                      d.addName(scs.nextLine());
	                      System.out.println("Enter the address");
	                      d.setAddress(scs.nextLine());
	                      System.out.println("Enter the email");
	                      d.setEmail(scs.nextLine());
	                      System.out.println("Enter the phone number");
	                      d.setPh_no(scs.nextLine());
	                      System.out.println("Enter the employee id");
	                      d.setId(scs.nextLine());
	                      System.out.println("Enter the developing product");
	                      d.setProductDeveloping(scs.nextLine());
	                      developers.add(d);
	                      total_employess();
			    	      break;
			      default: System.out.println("Wrong input");
			    	      break;
			      }
			      System.out.println("Do you want to add more.1-Yes 0-No");
		       }while(sci.nextInt()==1);
		       break;
		case 2:System.out.println("Enter employee id to be removed");
			   removeEmployee(scs.nextLine());
			   break;
		case 3: System.out.println("Total Employees= "+ count);
		        break;
		case 4: printEmployees();
		        break;
		default: System.out.println("Invalid option");
		        break;
		}
		System.out.println("Do you want to continue 1-Yes 0-No");
		}while(sci.nextInt()==1);
	  }
			
	private static void printEmployees() {
		System.out.println("Employees in Accolite are:");
		System.out.println("Managers :");
		Manager m; Developer d;
		Iterator itm=managers.iterator();
		Iterator itd=developers.iterator();
		while(itm.hasNext())
		{
		   m = (Manager) itm.next();	
		   System.out.println("-> "+m.getName()+";"+m.getId());
		}
		System.out.println("Developers :");
		while(itd.hasNext())
		{
		   d = (Developer) itd.next();	
		   System.out.println("-> "+d.getName()+";"+d.getId());
		}
	}

	private static void total_employess() {
		count++;
	}
	private static void removeEmployee(String nextLine) {
	  Iterator itm=managers.iterator();
	  Iterator itd=developers.iterator();
	  Manager m;
	  Developer d;
	  while(itm.hasNext())
	  {
		  m=(Manager) itm.next();
		  if(nextLine.equals(m.getId()))
		  {
			  managers.remove(m);
			  System.out.println("Employee removed");
			  count--;
			  return;
		  }
	  }
	  while(itd.hasNext())
	  {
		  d=(Developer) itd.next();
		  if(nextLine.equals(d.getId()))
		  {
			  developers.remove(d);
			  System.out.println("Employee removed");
			  count--;
			  return;
		  }
	  }
	  System.out.println("Employee not found...Invalid Id");
	  return;
	}

}
