package viikko_2.Task3_1_3;

import java.util.Date;

public class ClockTest {
    public static void main(String[] args) {

        // Get the Singleton instance of the Clock
        Clock clock = Clock.getInstance();

        // Get and display the initial current time
        Date initialTime = clock.getTime();
        System.out.println("Initial Current Time: " + initialTime);

        // Set a new time and retrieve it
        Date newTime = new Date();
        clock.setTime(newTime);
        Date updatedTime = clock.getTime();
        System.out.println("Updated Current Time: " + updatedTime);
    }
}

