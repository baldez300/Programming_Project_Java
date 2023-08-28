package viikko_1;

/*
    Enter the Customer class.
    The client has an id (int), a start time (long), an end time (long), methods for processing these (getters and setters)
    and a method for finding out the time spent (end time - start time).
    Write a test program in which you test the operation of your methods.
    The id of the first customer = 1.
    When a new customer is created, it gets an id as big as the previous customer.

    In this task, you can use as time stamps (start time/end time) the integers you define yourself or the values given by the System.
    currentTimeMillis() or System.nanotime() methods.
*/

import java.util.Scanner;

class Customer {
    private static int lastCustomerId = 0;

    private final int id;
    private long startTime;
    private long endTime;

    public Customer() {
        this.id = ++lastCustomerId;
    }

    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getTimeSpent() {
        return endTime - startTime;
    }
}

public class CustomerClassTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customer customer1 = new Customer();
        System.out.print("Enter start time for customer " + customer1.getId() + ": ");
        customer1.setStartTime(scanner.nextLong());
        System.out.print("Enter end time for customer " + customer1.getId() + ": ");
        customer1.setEndTime(scanner.nextLong());

        Customer customer2 = new Customer();
        System.out.print("Enter start time for customer " + customer2.getId() + ": ");
        customer2.setStartTime(scanner.nextLong());
        System.out.print("Enter end time for customer " + customer2.getId() + ": ");
        customer2.setEndTime(scanner.nextLong());

        System.out.println();
        System.out.println("Customer " + customer1.getId() + " spent: " + customer1.getTimeSpent() + " milliseconds.");
        System.out.println("Customer " + customer2.getId() + " spent: " + customer2.getTimeSpent() + " milliseconds.");

        System.out.println();
        System.out.println("Customer " + customer1.getId() + " started at: " + customer1.getStartTime());
        System.out.println("Customer " + customer2.getId() + " ended at: " + customer2.getEndTime());

        scanner.close();
    }
}




