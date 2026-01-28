package L100.Multithreading.Types_of_Thread_pools;

import java.util.concurrent.*;

public class WorkStealingPool {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService pool = Executors.newWorkStealingPool();

        for (int i = 1; i <= 8; i++) {
            int taskId = i;
            pool.submit(() -> {
                System.out.println("Task " + taskId +
                        " executed by " + Thread.currentThread().getName());
            });
        }

        pool.shutdown();
        pool.awaitTermination(5, TimeUnit.SECONDS); // 🔑 WAIT
    }
}
