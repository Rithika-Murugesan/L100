package L100.Multithreading.States_of_thread;

class RunningState extends Thread {
    public void run() { // When we use run method we need to extends Thread class...
        System.out.println("Thread is running: " + Thread.currentThread().getState());
    }

    public static void main(String[] args) {
        RunningState t = new RunningState();
        t.start();
    }
}
