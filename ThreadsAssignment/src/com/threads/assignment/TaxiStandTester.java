package com.threads.assignment;

import java.util.concurrent.Semaphore;

class TaxiStandTester {

	public static void main(String[] args) {
		
		
		Semaphore sem=new Semaphore(1);
		TaxiQueueRunnable tqr=new TaxiQueueRunnable();
		PassengerArrivalRunnable par=new PassengerArrivalRunnable();
		TaxiAssigner ta=new TaxiAssigner();
		PassengerAssigner pa=new PassengerAssigner();
		Thread tpar=new Thread(par);
		Thread ttqr=new Thread(tqr);
		Thread tta=new Thread(ta);
		Thread tpa=new Thread(pa);
		
		tpar.start();
		ttqr.start();
		tta.start();
		tpa.start();
		
		
		
		
		
	}

}
