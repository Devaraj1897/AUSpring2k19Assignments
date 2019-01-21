package com.threads.assignment;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Semaphore;

public class PassengerArrivalRunnable implements Runnable {
	Semaphore sem=TaxiStand.sem;
	@Override
	public void run() {
		int j;
		
		System.out.println("Thread Passenger started");
		TaxiStand t=TaxiStand.getInstance();
		String[] destination= {"Whitefield","Kormangala","Rajajinagar","Vijaynagar","Jubilee hills","Majestic","Malleshwaram",
				               "Nagarbhavi","Vidyaranyapura","Marathahalli"};
		for(int i=0;true;i++)
		{
			j=(int)(Math.random()*10);
			//System.out.println(i+") Random number="+j+";Destination="+destination[j]);
			Passenger p=new Passenger(destination[j],i+1);
			//t.allocatePassenger(p);
			t.getPassengerQueue().add(p);
			System.out.println("Passenger-"+(i+1)+" entered passenger queue for destination, "+destination[j]);
			if(i%5==0)
			{
				System.out.println("Size of the passenger Queue : "+t.getPassengerQueue().size());
				System.out.println("Passenger Queue status : "+ t.getPassengerQueue().toString());
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
