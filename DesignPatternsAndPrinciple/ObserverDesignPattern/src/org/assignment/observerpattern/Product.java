package org.assignment.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{
	
	
	private String productName;
	private List<Observer> listOfObserver=new ArrayList<Observer>();
	
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

	public List<Observer> getListOfObserver() {
		return listOfObserver;
	}

	public void setListOfObserver(List<Observer> listOfObserver) {
		this.listOfObserver = listOfObserver;
	}

	@Override
	public void registerObserver(Observer observer) {
		listOfObserver.add(observer);
	}

	@Override
	public void removedObserver(Observer observer) {
		listOfObserver.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for(Observer ob:listOfObserver) {
			ob.update(productName);
		}
	}

}
