package com.threads.assignment;

import java.util.concurrent.Semaphore;

public class TaxiAssigner implements Runnable {
    Semaphore sem=TaxiStand.sem;
    TaxiStand ts=TaxiStand.getInstance();
	@Override
	public void run() {
	    while(true) {
	    	if(ts.getTaxiQueue().isEmpty()) {
	    		try {
	    			//System.out.println("Taxi Queue empty.....");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}
	    	else {
	    		try {
					sem.acquire();
					//System.out.println("Taxi assigner acquired the Semaphore Lock");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		if(!ts.getTaxiQueue().isEmpty())
	    		{
	    			
	    			if(ts.getTaxis().size()<6)
	    			{
	    				System.out.println("Taxi-"+ts.getTaxiQueue().peek().getNumber()+" added to taxi stand");
	    				ts.getTaxis().add(ts.getTaxiQueue().poll());
	    			}
	    		}
	    		//System.out.println("Taxi assigner released the Semaphore Lock");
	    		sem.release();
	    	}
	    }
	}

}
