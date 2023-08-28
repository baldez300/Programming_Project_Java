package viikko_1;

/*
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class CustomerStep2 {
    private static int lastCustomerId = 0;

    private final int id;
    private long startTime;
    private long endTime;

    public CustomerStep2() {
        this.id = ++lastCustomerId;
    }

    public int getId() {
        return id;
    }

    /*
    public long getStartTime() {
        return startTime;
    }*/

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    /*
    public long getEndTime() {
        return endTime;
    }*/

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getTimeSpent() {
        return endTime - startTime;
    }
}

public class CustomerQueueTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<CustomerStep2> customerQueue = new LinkedList<>();

        while (true) {
            System.out.println("\nChoose an action by selecting its number:");
            System.out.println("1. Add customer");
            System.out.println("2. Delete customer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                CustomerStep2 customer = new CustomerStep2();
                System.out.print("Enter start time for customer " + customer.getId() + ": ");
                customer.setStartTime(System.nanoTime());
                customerQueue.add(customer);
                System.out.println("Customer " + customer.getId() + " added to the queue.");
            } else if (choice == 2) {
                if (!customerQueue.isEmpty()) {
                    CustomerStep2 removedCustomer = customerQueue.remove();
                    removedCustomer.setEndTime(System.nanoTime());
                    long timeSpentInQueue = removedCustomer.getTimeSpent();
                    System.out.println("Customer " + removedCustomer.getId() + " removed from the queue.");
                    System.out.println("Time spent in queue: " + timeSpentInQueue + " nanoseconds.");
                } else {
                    System.out.println("Queue is empty.");
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please choose again.");
            }
        }

        scanner.close();
    }
}

