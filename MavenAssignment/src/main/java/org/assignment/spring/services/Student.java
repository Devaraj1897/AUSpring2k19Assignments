package org.assignment.spring.services;

public class Student {

	String regnum;
	String name;
	int age;
	int phone;
	String address;
	
	
	
	public Student() {
		super();
	}



	public Student(String regnum, String name, int age, int phone, String address) {
		super();
		this.regnum = regnum;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}



	public String getRegnum() {
		return regnum;
	}



	public void setRegnum(String regnum) {
		this.regnum = regnum;
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



	public int getPhone() {
		return phone;
	}



	public void setPhone(int phone) {
		this.phone = phone;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Student [regnum=" + regnum + ", name=" + name + ", age=" + age + ", phone=" + phone + ", address="
				+ address + "]";
	}
	
	
}
