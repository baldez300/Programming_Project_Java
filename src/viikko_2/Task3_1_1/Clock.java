package viikko_2.Task3_1_1;

/*
    Implement the Clock class needed by the Simulator software according to the Singleton model.
    The clock time must be able to be changed and it must be possible to find out.
    Write a test program.
*/

import java.util.Date;

public class Clock {
    private static Clock instance = null;
    private Date currentTime;

    // Private constructor to prevent instantiation from other classes
    private Clock() {
        currentTime = new Date();
    }

    // Public static method to get the Singleton instance
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    // Method to set the current time
    public void setTime(Date time) {
        currentTime = time;
    }

    // Method to get the current time
    public Date getTime() {
        return currentTime;
    }
}


