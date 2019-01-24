package org.assignment.observerpattern;

public interface Subject {
	
	public void registerObserver(Observer observer);
	public void removedObserver(Observer observer);
	public void notifyObserver();

}
