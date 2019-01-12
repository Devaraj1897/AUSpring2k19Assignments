package com.accolite.au.practice;

public class Manager extends Employee {
	static int count;
	String managing_department;
	{
		System.out.println("Adding a manager");
	}
	public Manager() {
		System.out.println("Manager added");
		total_managers();
	}
	
	private void total_managers() {
		count++;
		
	}
    
	
	
	public String getManaging_department() {
		return managing_department;
	}

	public void setManaging_department(String managing_department) {
		this.managing_department = managing_department;
	}

	@Override
	public void works()
	{
		System.out.println("Manager doesnt work..He manages");
	}

	

}
