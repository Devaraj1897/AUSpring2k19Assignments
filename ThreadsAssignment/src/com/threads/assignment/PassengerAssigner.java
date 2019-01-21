package com.threads.assignment;

import java.util.concurrent.Semaphore;

public class PassengerAssigner implements Runnable {

	Semaphore sem=TaxiStand.sem;
	TaxiStand ts=TaxiStand.getInstance();
	@Override
	public void run() {
		
		boolean noTaxis=false;
		boolean notassigned=false;
		while(true) {
			if(ts.getPassengerQueue().isEmpty())
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				try {
					sem.acquire();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(ts.getTaxis().isEmpty())
				{
					noTaxis=true;
				}
				else {
					if(ts.allocatePassenger(ts.getPassengerQueue().peek())==false)
					{
						
						notassigned = true;
						ts.count++;
						System.out.println("Passenger-"+ts.getPassengerQueue().peek().getName()+" not assigned.Counter: "+ts.count+" Taxi Stand Size:"+ ts.getTaxis().size());
					}
					else {
						ts.getPassengerQueue().poll();
						ts.count=0;
					}
				}
				if(ts.count>15)
				{
					ts.count=0;
					System.out.println("Removing all, Counter:"+ts.count);
					ts.removeAll();
				}
				sem.release();
				if(notassigned || noTaxis)
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
			}
		}
		
	}

}
