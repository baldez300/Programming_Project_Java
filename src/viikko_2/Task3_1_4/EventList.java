package viikko_2.Task3_1_4;

import java.util.ArrayList;
import java.util.List;

public class EventList {
    private final List<Event> events; // List to store events

    // Constructor to initialize the event list
    public EventList() {
        events = new ArrayList<>();
    }

    // Clear the event list
    public void clear() {
        events.clear();
    }

    // Add an event to the event list
    public void addEvent(Event event) {
        events.add(event);
    }

    // Print all events in the event list
    public void printEvents() {
        for (Event event : events) {
            System.out.println("Event Type: " + event.getType() + ", Time: " + event.getTime());
        }
    }
}

