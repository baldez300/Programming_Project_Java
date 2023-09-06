package viikko_2.Task3_1_5;

import eduni.distributions.*;

public class ArrivalProcess {
    private final ContinuousGenerator arrivalGenerator;
    private final EventList eventList;

    public ArrivalProcess(ContinuousGenerator arrivalGenerator, EventList eventList) {
        this.arrivalGenerator = arrivalGenerator;
        this.eventList = eventList;
    }

    public void generateArrivals(int numberOfArrivals) {
        double currentTime = Clock.getInstance().getTime();
        for (int i = 0; i < numberOfArrivals; i++) {
            double arrivalInterval = arrivalGenerator.sample();
            currentTime += arrivalInterval;
            Event arrivalEvent = new Event(EventType.ARRIVAL, currentTime);
            eventList.addEvent(arrivalEvent);
        }
    }
}




