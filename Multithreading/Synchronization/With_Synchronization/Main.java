package L100.Multithreading.Synchronization.With_Synchronization;

class TicketCounter {
    int tickets = 1;

    synchronized void bookTicket(String name) { // ensures Mutual Exclusion...prevents race condition
        if (tickets > 0) {
            System.out.println(name + " booked the ticket!");
            tickets--; // critical section protected
        } else {
            System.out.println("Sorry, " + name + " no tickets left.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        Thread t1 = new Thread(() -> counter.bookTicket("Person A"));
        Thread t2 = new Thread(() -> counter.bookTicket("Person B"));

        t1.start();
        t2.start();
    }
}
