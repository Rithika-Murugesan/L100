package L100.Multithreading.Ways_to_Create_Thread.Extending_Thread_Class;

class LoggerThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Logging system health...");
            try {
                Thread.sleep(2000); // just pauses its execution...not stops
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LoggerThread logger = new LoggerThread();
        logger.start(); // Starts background logging
    }
}
