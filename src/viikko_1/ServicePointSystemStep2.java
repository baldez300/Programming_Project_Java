package viikko_1;

/*
    At the end of the previous program,
    report the average time spent at the service point (= the average time spent by all customers in the queue).
    Think about what all you need for this.
*/

import java.util.LinkedList;
import java.util.Queue;

class CustomerStep4 {
    private static int lastCustomerId = 0;
    private final int id;

    public CustomerStep4() {
        this.id = ++lastCustomerId;
    }

    public int getId() {
        return id;
    }
}

class ServicePointStep2 {
    private Queue<CustomerStep4> queue = new LinkedList<>();

    public void addQueue(CustomerStep4 customer) {
        queue.add(customer);
    }

    public CustomerStep4 removeFromQueue() {
        return queue.poll();
    }

    public void serve() {
        long totalServiceTime = 0;
        int numCustomersServed = 0;

        while (!queue.isEmpty()) {
            CustomerStep4 customer = removeFromQueue();
            System.out.println("Serving customer " + customer.getId());
            try {
                long serviceTime = (long) (Math.random() * 5000); // Random service time in milliseconds
                totalServiceTime += serviceTime;
                numCustomersServed++;
                Thread.sleep(serviceTime); // Simulate service time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished serving customer " + customer.getId());
        }

        double averageServiceTime = (double) totalServiceTime / numCustomersServed;
        System.out.println("Average time spent at the service point: " + averageServiceTime + " milliseconds");
    }
}

public class ServicePointSystemStep2 {
    public static void main(String[] args) {
        ServicePointStep2 servicePoint = new ServicePointStep2();

        int numCustomers = 5; // Number of customers to create

        for (int i = 0; i < numCustomers; i++) {
            CustomerStep4 customer = new CustomerStep4();
            servicePoint.addQueue(customer);
            System.out.println("Customer " + customer.getId() + " added to the queue.");
        }

        System.out.println("Serving customers...");
        servicePoint.serve();

        System.out.println("All customers served.");
    }
}

