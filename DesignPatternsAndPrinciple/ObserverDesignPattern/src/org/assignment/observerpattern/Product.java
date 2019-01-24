package org.assignment.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements ObserverInterface{
	
	
	private String productName;
	private List<Flipkart> listOfObserver=new ArrayList<Flipkart>();
	
	private boolean available;
	
	
	
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
		if(available)
			notifyObserver();
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<Flipkart> getListOfObserver() {
		return listOfObserver;
	}

	public void setListOfObserver(List<Flipkart> listOfObserver) {
		this.listOfObserver = listOfObserver;
	}

	@Override
	public void registerObserver(Flipkart observer) {
		listOfObserver.add(observer);
	}

	@Override
	public void removedObserver(Flipkart observer) {
		listOfObserver.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for(Flipkart ob:listOfObserver) {
			ob.update(productName);
		}
	}

}
