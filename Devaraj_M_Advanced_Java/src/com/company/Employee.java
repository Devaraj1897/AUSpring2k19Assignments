package com.company;

public class Employee implements Comparable<Employee>{
   private String name;
   private String id;
   private String phone;
   private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

@Override
public int compareTo(Employee o) {
	return name.compareTo(o.name);
  //return id.compareTo(o.id);
  //return age.compareTo(o.age);
}
   
   
}
