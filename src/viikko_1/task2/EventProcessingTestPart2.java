package viikko_1.task2;

/*
    Define the event type using your own Java enum specification:
      public enum EventType{...}.

    According to the previous task, add the type of event to the Event objects.
    At first there can be, for example, 2 types (arrival, departure).
    The types of events are indicated when the event list is printed.
*/

import java.util.PriorityQueue;

enum EventTypePart2 {
    ARRIVAL, DEPARTURE
}

class EventPart2 implements Comparable<EventPart2> {
    private final double eventTime;
    private final EventTypePart2 eventType;

    public EventPart2(double eventTime, EventTypePart2 eventType) {
        this.eventTime = eventTime;
        this.eventType = eventType;
    }

    public double getEventTime() {
        return eventTime;
    }

    public EventTypePart2 getEventType() {
        return eventType;
    }

    @Override
    public int compareTo(EventPart2 other) {
        return Double.compare(this.eventTime, other.eventTime);
    }
}

class EventListPart2 {
    private final PriorityQueue<EventPart2> eventQueue;

    public EventListPart2() {
        eventQueue = new PriorityQueue<>();
    }

    public void addEvent(EventPart2 event) {
        eventQueue.add(event);
    }

    public EventPart2 getNextEvent() {
        return eventQueue.poll();
    }

    public boolean isEmpty() {
        return eventQueue.isEmpty();
    }
}

public class EventProcessingTestPart2 {
    public static void main(String[] args) {
        EventListPart2 eventList = new EventListPart2();

        eventList.addEvent(new EventPart2(5.0, EventTypePart2.ARRIVAL));
        eventList.addEvent(new EventPart2(2.0, EventTypePart2.ARRIVAL));
        eventList.addEvent(new EventPart2(8.0, EventTypePart2.DEPARTURE));
        eventList.addEvent(new EventPart2(3.0, EventTypePart2.ARRIVAL));

        while (!eventList.isEmpty()) {
            EventPart2 nextEvent = eventList.getNextEvent();
            System.out.println("Next event at time " + nextEvent.getEventTime() +
                    ", Type: " + nextEvent.getEventType());
        }
    }
}

