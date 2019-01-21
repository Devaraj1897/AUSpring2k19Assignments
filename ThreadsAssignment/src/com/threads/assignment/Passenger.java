package com.threads.assignment;

public class Passenger {
	private String destination;
	private int name;

	public Passenger() {

	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public Passenger(String destination, int i) {
		this.destination = destination;
		this.name = i;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Passenger [destination=" + destination + ", name=" + name + "]";
	}

}
