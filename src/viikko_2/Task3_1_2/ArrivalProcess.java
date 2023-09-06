package viikko_2.Task3_1_2;

import eduni.distributions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrivalProcess {
    public static void main(String[] args) {

        // Create an instance of the Uniform distribution
        Uniform uniformDistribution = new Uniform(1.0, 5.0); // Adjust min and max values as needed

        // Initialize the clock and event list
        Clock clock = Clock.getInstance();
        EventList eventList = new EventList();

        clock.setTime(0.0);
        eventList.clear();

        // Generate a specified number of arrivals
        int numberOfArrivals = 10; // Adjust as needed

        List<Double> arrivalIntervals = new ArrayList<>();

        // Generate random arrival intervals and store them
        for (int i = 0; i < numberOfArrivals; i++) {
            double arrivalInterval = uniformDistribution.sample();
            arrivalIntervals.add(arrivalInterval);
        }

        // Sort the arrival intervals in ascending order
        Collections.sort(arrivalIntervals);

        // Create arrival events based on arrival intervals
        for (Double arrivalInterval : arrivalIntervals) {
            // Advance the clock by the arrival interval
            clock.setTime(clock.getTime() + arrivalInterval);

            // Create an arrival event and add it to the event list
            Event arrivalEvent = new Event("Arrival", clock.getTime());
            eventList.addEvent(arrivalEvent);
        }

        // Print the event list
        eventList.printEvents();
    }
}

