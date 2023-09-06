package viikko_2.Task3_1_5;

import java.util.ArrayList;

public class EventList {
    private final ArrayList<Event> events;

    public EventList() {
        events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void printEvents() {
        for (Event event : events) {
            System.out.println(event.getType() + " at time " + event.getTime());
        }
    }
}



