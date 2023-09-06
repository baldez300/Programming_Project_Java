package viikko_2.Task3_1_2;

public class Clock {
    private static Clock instance = null;
    private double currentTime;

    // Private constructor to initialize the clock
    private Clock() {
        currentTime = 0.0;
    }

    // Get the Singleton instance of the Clock
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    // Set the current time
    public void setTime(double time) {
        currentTime = time;
    }

    // Get the current time
    public double getTime() {
        return currentTime;
    }
}

