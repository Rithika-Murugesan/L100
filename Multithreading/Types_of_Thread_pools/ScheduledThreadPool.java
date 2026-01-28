package L100.Multithreading.Types_of_Thread_pools;

import java.util.concurrent.*;

public class ScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // Run after 3 seconds
        scheduler.schedule(() -> System.out.println("Backup started"), 3, TimeUnit.SECONDS);

        // Run every 2 seconds
        scheduler.scheduleAtFixedRate(() -> System.out.println("Health check..."), 1, 2, TimeUnit.SECONDS);
    }
}
