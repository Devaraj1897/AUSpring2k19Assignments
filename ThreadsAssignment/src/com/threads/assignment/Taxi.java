package com.threads.assignment;

public class Taxi {
	private int number;
	private String destination;
	private int size;
	private int time;
	
	
	
	@Override
	public String toString() {
		return "Taxi-" + number+" ";
	}
	public Taxi()
	{
		this.destination=null;
		this.size=4;
	}
	public Taxi(int i)
	{
		this.number=i;
		this.destination=null;
		this.size=0;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isSet() {
		if(this.destination==null)
			return false;
		return true;
	}
	
	public String getDestination() {
		return destination;
	}
    public boolean assignPassenger() {
    	//System.out.println("Here....Taxi-"+this.number+"...this.size="+this.size);
    	this.size++;
    	return true;
    }
	public void setDestination(String destination) {
		this.destination = destination;
	}
}
