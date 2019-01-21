Taxi Thread Assignment.

There are 8 JAVA files-
->Taxi Bean Class.
->Passenger Bean Class.
->TaxiQueueRunnable.
->PassengerArrivalRunnable.
->TaxiAssigner.
->PassengerAssigner.
->Taxi Stand.
->TaxiStandTester(Main class that has main method i.e starts the main thread and forks other threads).

I have used a Counting Semaphore which has count=1. That is, it allows only "one" thread to execute to
on the shared data.
Semaphore lock acquired when each thread wants to execute on Taxi Stand( taxis ). And the lock is released
after completion.
The Semaphore lock oscillates between TaxiAssinger.java and PassengerAssigner.java

TaxiStand.class has instance variables-
->passengerQueue(Queue)
->taxiQueue(Queue)
->sem(Semaphore)
->taxis(LinkedList)
->count(keeps the count of number of times passengers are not assigned a taxi).

allocatePassenger(Passenger) method in TaxiStand.class allocates Passenger to Taxis.



There are four threads
->TaxiQueueRunnable(Generates unlimited taxis)
->PassengerArrivalRunnable(Genrates passengers with some destination)
->TaxiAssigner(Adds taxis to Taxi Stand)
->PassengerAssigner(Allocates passengers to taxis.)

Main starts the above four threads and terminates.

Assumptions-
->Taxi Stand size is set to Five.
->Each Taxi can accomodate atmost 4 people.
->Taxis enter the TaxiQueue before going to Taxi Stand.
->Taxis wait in the Taxi Stand. If upcoming 10 passengers are not alloted to any of the taxi. 
Then taxi drivers get restless and all the taxis in the stand leave from Taxi Stand making way for the new taxis.
->Unlimited taxis are generated. Each taxi enters taxi Queue every 7 secs.
->Passengers enter the Passenger Queue before taking a taxi.
->Passengers generated after every 3 secs.
->Unlimited passengers keep generating.