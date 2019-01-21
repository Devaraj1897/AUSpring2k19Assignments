package com.factorymethod.assignment.FactoryMethodAssignment;

public class Student {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void printAddress(String address){
		getAddress().printAddress(address);
	}
}