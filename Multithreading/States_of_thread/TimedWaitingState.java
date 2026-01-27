package L100.Multithreading.States_of_thread;

class TimedWaitingState {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1000); // Timed waiting
                System.out.println("Woke up after sleep");
            } catch (InterruptedException e) {
            }
        });

        t.start();
        Thread.sleep(200);
        System.out.println("State: " + t.getState()); // TIMED_WAITING
    }
}
