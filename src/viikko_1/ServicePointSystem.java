package viikko_1;

/*
    Program a single service point system where the customer moves through the system:
    Define the Service Point class, which is associated with a queue (LinkedList).
    Define methods void addQueue(Customer a) and
    Client removeFromQueue().
    Define a method named serve for the service point, which picks up all the customers in turn from the queue in a loop.
    a delay (=service time) is coded in the service method before the deleteQueue method is called.
    The delay is created by calling the Thread.sleep(time) method.
    The time as a parameter of the method is the sleep time and it is drawn in the program, e.g. with the Math.random() method.
    After removing the customer, we move in the loop to serve and remove the next customer.
    the serve method prints the end time of each service (customer deletion).
    When the queue is empty, the execution of the serve method ends.
    At the beginning of the main program,
    write a loop in which you create the desired number of customers at the service point before you start serving.
*/

import java.util.LinkedList;

class CustomerStep3 {
    private static int lastCustomerId = 0;
    private final int id;

    public CustomerStep3() {
        this.id = ++lastCustomerId;
    }

    public int getId() {
        return id;
    }
}

class ServicePoint {
    private LinkedList<CustomerStep3> queue = new LinkedList<>();

    public void addQueue(CustomerStep3 customer) {
        queue.add(customer);
    }

    public void removeFromQueue() {
        if (!queue.isEmpty()) {
            CustomerStep3 servedCustomer = queue.poll();
            System.out.println("Customer " + servedCustomer.getId() + " served.");
        }
    }

    public void serve() {
        while (!queue.isEmpty()) {
            CustomerStep3 servedCustomer = queue.peek();
            System.out.println("Serving customer " + servedCustomer.getId());

            // Simulate service time with a delay
            int serviceTime = (int) (Math.random() * 5000); // 0 to 5 seconds
            try {
                Thread.sleep(serviceTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            removeFromQueue();
        }
        System.out.println("No more customers to serve.");
    }
}

public class ServicePointSystem {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();

        // Create customers and add them to the queue
        for (int i = 0; i < 5; i++) {
            CustomerStep3 customer = new CustomerStep3();
            servicePoint.addQueue(customer);
            System.out.println("Customer " + customer.getId() + " added to the queue.");
        }

        // Serve customers
        servicePoint.serve();
    }
}



