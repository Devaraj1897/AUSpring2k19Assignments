package org.assignment.observerpattern;

public class ObserverPatternTester {
  public static void main(String[] args) {
	Customer customer1=new Customer();
	Customer customer2=new Customer();
	
	customer1.setCustomerName("Kishore");
	customer2.setCustomerName("Tarun");
	
	Product iphone6=new Product();
	iphone6.setProductName("Apple iPhone 6");
	iphone6.setAvailable(false);
	
	iphone6.registerObserver(customer1);
	iphone6.registerObserver(customer2);
	
	iphone6.setAvailable(true);
	
	iphone6.removedObserver(customer2);
	System.out.println("=====================================================");
	iphone6.setAvailable(true);
  }
}
