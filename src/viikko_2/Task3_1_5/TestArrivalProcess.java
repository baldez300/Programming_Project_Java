package viikko_2.Task3_1_5;

import eduni.distributions.*;

public class TestArrivalProcess {
    public static void main(String[] args) {
        // Create an Event List
        EventList eventList = new EventList();

        // Create a Uniform random number generator for arrival intervals
        Uniform arrivalGenerator = new Uniform(1.0, 5.0);

        // Create an Arrival Process with the random number generator
        ArrivalProcess arrivalProcess = new ArrivalProcess(arrivalGenerator, eventList);

        // Generate and add 10 arrival events to the event list
        arrivalProcess.generateArrivals(10);

        // Display the event list
        System.out.println("Event List:");
        eventList.printEvents();
    }
}


