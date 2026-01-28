package L100.Multithreading.Types_of_Thread_pools;

import java.util.concurrent.*;

public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            pool.execute(() -> {
                System.out.println("Notification " + taskId + " sent by " + Thread.currentThread().getName());
            });
        }

        pool.shutdown();
    }
}
