package L100.Multithreading.Types_of_Thread_pools;

import java.util.concurrent.*;

public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3); // 3 threads fixed...

        for (int i = 1; i <= 6; i++) {
            int taskId = i;
            pool.execute(() -> {
                System.out.println("Task " + taskId + " handled by " + Thread.currentThread().getName());
            });
        }

        pool.shutdown();
    }
}
