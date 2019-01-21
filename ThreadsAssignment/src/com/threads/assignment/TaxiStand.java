package com.threads.assignment;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;


public class TaxiStand {
	static int count=0;
	static Semaphore sem=new Semaphore(1);
    private int size = 5;
    private static LinkedList<Taxi> taxis;
    private static Queue<Taxi> taxiQueue;
    private static Queue<Passenger> passengerQueue;

    static TaxiStand t=new TaxiStand();
    public static TaxiStand getInstance()
    {
    	taxis=new LinkedList<Taxi>();
    	taxiQueue=new LinkedList<Taxi>();
    	passengerQueue=new LinkedList<Passenger>();
    	return t;
    }
    
    private TaxiStand() {
    	
    }

	public static Queue<Taxi> getTaxis() {
		return taxis;
	}

	public static void setTaxis(LinkedList<Taxi> taxis) {
		TaxiStand.taxis = taxis;
	}

	public static Queue<Taxi> getTaxiQueue() {
		return taxiQueue;
	}

	public static void setTaxiQueue(LinkedList<Taxi> taxiQueue) {
		TaxiStand.taxiQueue = taxiQueue;
	}

	public static Queue<Passenger> getPassengerQueue() {
		return passengerQueue;
	}

	public static void setPassengerQueue(LinkedList<Passenger> passengerQueue) {
		TaxiStand.passengerQueue = passengerQueue;
	}
	
	
	
	/*public boolean addTaxi(Taxi c){
		
    }

    public boolean isFull(){
    	System.out.println("In isFull() Size="+taxis.size());
        return (taxis.size()==size) ? true : false;
    }
    
    public boolean isEmpty() {
    	System.out.println("In isEmpty() Size="+taxis.size());
        return (taxis.size()==0) ? true : false;
    }*/
    
    public boolean allocatePassenger(Passenger p) {
    	Iterator it=taxis.iterator();
    	Taxi t=null;
    	while(it.hasNext()) {
    		t=(Taxi) it.next();
    		if(t.getDestination()==null)
    		{
    			t.setDestination(p.getDestination());
    			t.assignPassenger();
    			System.out.println("===============================================================================================");
    			System.out.println("Passenger-"+p.getName()+" has board Taxi-"+t.getNumber()+" for destination:"+t.getDestination());
    			System.out.println("Number of seats occupied are :"+t.getSize());
    			System.out.println("===============================================================================================");
    			return true;
    		}
    		else if(t.getDestination().equals(p.getDestination())) {
    			t.assignPassenger();
    			if(t.getSize()==4)
    			{
    				taxis.remove(t);
    				System.out.println("Taxi-"+t.getNumber()+"(Taxi full) has departed for destination:"+t.getDestination());
    			}
    			System.out.println("================================================================================================");
    			System.out.println("Passenger-"+p.getName()+" has board Taxi-"+t.getNumber()+" for destination:"+t.getDestination());
    			System.out.println("Number of seats occupied are :"+t.getSize());
    			System.out.println("================================================================================================");
    			return true;
    		}
    	}
    	return false;
    }

	public void removeAll() {
		System.out.println("Taxi Stand status:"+taxis);
		taxis.clear();
		System.out.println("After removing taxis, Taxi Stand status:"+taxis);
	}
    
    /*
    public void processPassengerQueue(){
        System.out.println("Starting to process passengerQueue with " + passengerQueue.size() + " passengers");
      
        System.out.println("After processing passengerQueue " + passengerQueue.size() + " passengers remain in queue");
    }

    public void printStatus() {
        ListIterator<Taxi> standIterator = taxiStand.listIterator();
        int position=0;
        while(standIterator.hasNext()) {
            Taxi taxi = standIterator.next();
            position++;
            System.out.println(position + ". Taxi to " + taxi.getDestination() + " passengers=" + taxi.getpassengerCount());
        }
    }
    */
}
