package com.accolite.assignment.soap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonHandler {
	
	static List<Person> persons=new ArrayList();
	
	public String create(int eid,String name,int age)
	{
		Person p=new Person();
		p.setEid(eid);
		p.setAge(age);
		p.setName(name);
		persons.add(p);
		System.out.println("CREATE:"+p.toString());
		return "\n"+p.toString();
	}
    
	public String update(int eid,String name,int age)
	{
		     Iterator it=persons.iterator();
		     Person p = null;
		     while(it.hasNext())
		     {
		    	 p=(Person) it.next();
		    	 if(eid==p.getEid())
		    	 {
		    		 p.setAge(age);
		    		 p.setName(name);
		    		 break;
		    	 }
		     }
		     System.out.println("UPDATE:"+p.toString());
		     return "\n"+p.toString();     
	}
	public boolean delete(int eid)
	{
		 Iterator it=persons.iterator();
	     Person p = null;
	     while(it.hasNext())
	     {
	    	 p=(Person) it.next();
	    	 if(eid==p.getEid())
	    	 {
	    		 System.out.println("DELETE:"+p.toString());
	    		 persons.remove(p);
	    		 return true;
	    	 }
	     }
	     return false;
	}
	public String retrieve(int eid) {
		 Iterator it=persons.iterator();
	     Person p = null;
	     System.out.println(persons.toString());
	     while(it.hasNext())
	     {
	    	 p=(Person) it.next();
	    	 if(eid==p.getEid())
	    	 {
	    		 System.out.println("RETRIEVE:"+p.toString());
	    		 return "\n"+p.toString();
	    	 }
	     }
	     return "\n"+"No match found";
	}
	public String retrieveAll()
	{
		System.out.println("List is :\n"+persons.toString());
		return persons.toString();
	}
}
