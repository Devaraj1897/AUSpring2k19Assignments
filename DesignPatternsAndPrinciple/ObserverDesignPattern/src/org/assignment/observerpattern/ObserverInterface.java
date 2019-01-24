package org.assignment.observerpattern;

public interface ObserverInterface {
	
	public void registerObserver(Flipkart observer);
	public void removedObserver(Flipkart observer);
	public void notifyObserver();

}
