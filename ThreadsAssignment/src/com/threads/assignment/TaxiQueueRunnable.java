package com.threads.assignment;

import java.util.concurrent.Semaphore;

public class TaxiQueueRunnable implements Runnable {
 
    Semaphore sem=TaxiStand.sem;
    
	@Override
	public void run() {
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
		System.out.println("Thread Taxi started");
		int i;
		
		TaxiStand ts=TaxiStand.getInstance();
		for(i=0;i<10;i++)
		{
			Taxi t=new Taxi(i+1);
			ts.getTaxiQueue().add(t);
			System.out.println("Taxi-"+(i+1)+" entered taxi queue");
			if(i%4==0)
			{
				System.out.println("Size of Taxi Queue is : "+ts.getTaxiQueue().size());
				System.out.println("Taxi Queue status : "+ts.getTaxiQueue());
			}
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
