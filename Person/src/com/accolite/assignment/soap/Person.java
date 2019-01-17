package com.accolite.assignment.soap;

public class Person {
 
	String name;
	int age;
	int eid;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "||Person: Name=" + name + "; Age=" + age + "; Eid=" + eid + "||";
	}
	
	

	
	
	
	
}
