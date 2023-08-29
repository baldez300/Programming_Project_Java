package viikko_1.task2;

/*
    Define the Event and Event List classes so that the Event List can be used to process the Event objects in the correct chronological order.
    The essential information related to the event is the event time, and it is essential that the next event can be retrieved from the event list upon request.

    You can use the PriorityQueue class in the implementation of the list so that the Event list contains PriorityQueue.
    In order for the order to be realized, Events must implement the Comparable interface.

    Make a test program that you can
    a) generate events in the list,
    b) deletes the first (=next) event from the list and
    c) prints the contents of the event list arranged by event time.

    As a tip for point c: You can read from the API description that Java's for iteration does not print the contents of PriorityQueue in any specific order,
    but you have to come up with a way other than for iteration.
*/


import java.util.PriorityQueue;

class Event implements Comparable<Event> {
    private final double eventTime;

    public Event(double eventTime) {
        this.eventTime = eventTime;
    }

    public double getEventTime() {
        return eventTime;
    }

    @Override
    public int compareTo(Event other) {
        return Double.compare(this.eventTime, other.eventTime);
    }
}

class EventList {
    private final PriorityQueue<Event> eventQueue;

    public EventList() {
        eventQueue = new PriorityQueue<>();
    }

    public void addEvent(Event event) {
        eventQueue.add(event);
    }

    public Event getNextEvent() {
        return eventQueue.poll();
    }

    public boolean isEmpty() {
        return eventQueue.isEmpty();
    }
}

public class EventProcessingTest {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        eventList.addEvent(new Event(5.0));
        eventList.addEvent(new Event(2.0));
        eventList.addEvent(new Event(8.0));
        eventList.addEvent(new Event(3.0));

        while (!eventList.isEmpty()) {
            Event nextEvent = eventList.getNextEvent();
            System.out.println("Next event at time: " + nextEvent.getEventTime());
        }
    }
}

