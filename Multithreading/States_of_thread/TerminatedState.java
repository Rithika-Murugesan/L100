package L100.Multithreading.States_of_thread;

class TerminatedState extends Thread {
    public void run() {
        System.out.println("Task completed");
    }

    public static void main(String[] args) throws InterruptedException {
        TerminatedState t = new TerminatedState();
        t.start();
        t.join(); // Wait for thread to finish
        System.out.println("State after completion: " + t.getState());
    }
}
