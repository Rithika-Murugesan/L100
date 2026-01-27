package L100.Multithreading.States_of_thread;

class WaitingState {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Thread t = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread waiting...");
                    lock.wait();
                    System.out.println("Thread resumed...");
                } catch (InterruptedException e) {
                }
            }
        });

        t.start();
        Thread.sleep(500); // Let thread go into waiting
        synchronized (lock) {
            lock.notify();
        }
    }
}
