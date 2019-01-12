package com.company;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class CompanyTester {

	public static void main(String[] args) {
        Scanner sci =new Scanner(System.in);
        Scanner scs =new Scanner(System.in);
        Company c[]=new Company[10];
        Address a[]=new Address[10];
        int j=1;
        for(int i=0;i<10;i++)
        {
            c[i]=new Company();
            a[i]=new Address();
        	System.out.println("Enter details for Company-"+ (i+1));
        	System.out.println("Enter name of the company:");
        	c[i].setName(scs.nextLine());
        	System.out.println("Provide Address");
        	System.out.println("Enter Door No:");
        	a[i].setDoor_no(sci.nextInt());
        	System.out.println("Enter street:");
        	a[i].setStreet(scs.nextLine());
        	System.out.println("Enter locality");
        	a[i].setLocality(scs.nextLine());
        	System.out.println("Enter City");
        	a[i].setCity(scs.nextLine());
        	System.out.println("Enter State");
        	a[i].setState(scs.nextLine());
        	System.out.println("Enter pincode");
        	a[i].setPincode(sci.nextInt());
        	c[i].setAddress(a[i]);
            System.out.println(c[i]);
            do{
            	Employee e=new Employee();
            	System.out.println("Enter the details of employee-"+ j);
            	System.out.println("Name: ");
            	e.setName(scs.nextLine());
            	System.out.println("Employee Id:");
            	e.setId(scs.nextLine());
            	System.out.println("Phone Number");
            	e.setPhone(scs.nextLine());
            	System.out.println("Age:");
            	e.setAge(sci.nextInt());
                c[i].addEmployee(e);
                System.out.println("Do you want to add another employee? 1-Yes 0-No");         
             }while(sci.nextInt()==1);
        }
        System.out.println("===========================================================\n");
        System.out.println("Number of employees whose age is below 30");
        for(int i=0;i<10;i++)
        {
        	Iterator it=(Iterator)c[i].getEmployees().iterator();
        	while(it.hasNext())
        	{
        		Employee e=(Employee) it.next();
        		if(e.getAge()<30)
        			System.out.println("Name: "+e.getName()+" ;"+" ID: "+ e.getId());
        	}
        }
        
        System.out.println("============================================================\n");
        System.out.println("List of Companies in same city");
        for(int i=0;i<10;i++)
        {
            if(c[i].getAddress().getCity().toUpperCase().equals("BANGALORE"))
            	System.out.println(c[i].getName());
        }
        System.out.println("============================================================\n");
        for(int i=0;i<10;i++)
           Collections.sort(c[i].getEmployees());
        System.out.println("Printing the sorted Employees.");
        for(int i=0;i<10;i++)
        	System.out.println(c[i].getEmployees());
	}

}
