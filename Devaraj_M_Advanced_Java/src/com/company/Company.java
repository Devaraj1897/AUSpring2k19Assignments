package com.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
     private String name;
     private Address address;
     private List<Employee> employees;
     
    public Company()
    {
    	employees=new ArrayList();
    }
     
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void addEmployee(Employee e)
	{
		employees.add(e);
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", address=" + address + "]";
	}    
	
	
}
