package viikko_2.Task3_1_2;

public class Event {
    private final String type; // Type of the event
    private final double time; // Time of the event

    // Constructor to create an event with type and time
    public Event(String type, double time) {
        this.type = type;
        this.time = time;
    }

    // Get the type of the event
    public String getType() {
        return type;
    }

    // Get the time of the event
    public double getTime() {
        return time;
    }
}

