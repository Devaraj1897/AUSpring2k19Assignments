package org.assignment.observerpattern;

public class ObserverPatternTester {
  public static void main(String[] args) {
	Purchaser customer1=new Purchaser();
	Purchaser customer2=new Purchaser();
	
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
