package viikko_2.Task3_1_5;

/*
    Let's make the following test program entity, which includes these classes in separate files with code comments:
    Customer, Clock, Event, Event Type, Event List, Arrival Process (which includes a random number generator),
    Service Point and for the main TestArrivalProcess.
    Please note that in this task the passage of time is not yet simulated according to the three-phase model.

    In the test program, arrival events are generated: i.e. 10 events are created in the event list.
    Finally (in this test program) the clock shows the time of the last generated event.

    Once all events are generated, they are all processed sequentially (no clock is moved here).
    Customers are created in the Service Point's queue when processing transactions (extract each transaction from the list one by one).
    Each event time is recorded as the customer's arrival time.

    After this, the clock is moved forward a little, e.g. 5 time units.
    With this clocking, the service point is cleared one customer at a time in the program loop,
    and the result of the clearing tells how long each customer spent in the system.
*/

public class Clock {
    private static Clock instance = null;
    private double currentTime;

    // Private constructor to prevent instantiation from other classes
    private Clock() {
        currentTime = 0.0;
    }

    // Public static method to get the Singleton instance
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    // Method to set the current time
    public void setTime(double time) {
        currentTime = time;
    }

    // Method to get the current time
    public double getTime() {
        return currentTime;
    }
}



