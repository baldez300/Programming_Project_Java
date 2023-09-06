package viikko_2.Task3_1_5;

public class Event {
    private final EventType type;
    private final double time;

    public Event(EventType type, double time) {
        this.type = type;
        this.time = time;
    }

    public EventType getType() {
        return type;
    }

    public double getTime() {
        return time;
    }
}



