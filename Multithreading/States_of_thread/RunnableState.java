package L100.Multithreading.States_of_thread;

class RunnableState {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread running...");
        });
        t.start(); // moves to runnable...and placed in job queue...
        System.out.println("State after start: " + t.getState()); // RUNNABLE
    }
}
