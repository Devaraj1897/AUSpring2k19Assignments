package com.accolite.au.practice;

public class Employee {

	String name;
	String ph_no;
	String email;
	String address;
	String id;
	{
		System.out.println("Adding employee");
	}
	public Employee()
	{
	    System.out.println("Employee added");
	}
	
	public void addName(String nextLine) {
		this.name=nextLine;
	}
	public String getPh_no() {
		return ph_no;
	}
    
	public String getName() {
		return name;
	}
	public void setPh_no(String ph_no) {
		this.ph_no = ph_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void works()
	{
		System.out.println(this.name +" is working");
	}
	
	public void getDetails()
	{
		System.out.println(this.name +" : "+ this.address +" : "+ this.email);
	}
}
