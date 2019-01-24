package org.assignment.observerpattern;

public class Purchaser implements Flipkart {

	private String customerName;
	private ObserverInterface subject;
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public ObserverInterface getSubject() {
		return subject;
	}

	public void setSubject(ObserverInterface subject) {
		this.subject = subject;
	}

	@Override
	public void update(String productName) {
		System.out.println("Hello "+customerName+", "+productName+" is now available.");
		
	}	
}
