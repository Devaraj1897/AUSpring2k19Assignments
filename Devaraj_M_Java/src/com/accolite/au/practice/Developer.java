package com.accolite.au.practice;

public class Developer extends Employee {
	static int count;
	String productDeveloping;
	{
		System.out.println("Adding a developer");
	}
	public Developer() {
		System.out.println("Developer added");
		total_developers();
	}
	private void total_developers() {
	       count++;
	}
	
	
	
	
	public String getProductDeveloping() {
		return productDeveloping;
	}
	public void setProductDeveloping(String productDeveloping) {
		this.productDeveloping = productDeveloping;
	}
	public void getDetails()
	{
		System.out.println("No developer details..Ooppsss Sorry");
	}

}
