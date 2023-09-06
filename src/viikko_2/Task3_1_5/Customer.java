package viikko_2.Task3_1_5;

public class Customer {
    private double arrivalTime;
    private double departureTime;

    public Customer(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public double getTimeSpentInSystem() {
        return departureTime - arrivalTime;
    }
}



