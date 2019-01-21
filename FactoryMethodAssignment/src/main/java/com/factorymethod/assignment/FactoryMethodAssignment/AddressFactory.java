package com.factorymethod.assignment.FactoryMethodAssignment;

public class AddressFactory {

	public static Address getAddress(){
		return new Address();
	}
}