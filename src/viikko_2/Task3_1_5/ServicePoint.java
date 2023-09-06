package viikko_2.Task3_1_5;

import java.util.LinkedList;
import java.util.Queue;

public class ServicePoint {
    private final Queue<Customer> queue;

    public ServicePoint() {
        queue = new LinkedList<>();
    }

    public void enqueueCustomer(Customer customer) {
        queue.add(customer);
    }

    public Customer dequeueCustomer() {
        return queue.poll();
    }

    public boolean isQueueEmpty() {
        return queue.isEmpty();
    }
}


