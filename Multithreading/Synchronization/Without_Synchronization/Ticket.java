package L100.Multithreading.Synchronization.Without_Synchronization;

class TicketCounter {
    int tickets = 1; // only 1 ticket available

    void bookTicket(String name) {
        if (tickets > 0) {
            System.out.println(name + " booked the ticket!");
            tickets--; // shared resource update
        } else {
            System.out.println("Sorry, " + name + " no tickets left.");
        }
    }
}

public class Ticket {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        Thread t1 = new Thread(() -> counter.bookTicket("Alice")); // creates child thread1
        Thread t2 = new Thread(() -> counter.bookTicket("Bob")); // creates child thread2

        t1.start();
        t2.start();
    }
}
