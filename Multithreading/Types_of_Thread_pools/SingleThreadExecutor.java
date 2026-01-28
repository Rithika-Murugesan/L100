package L100.Multithreading.Types_of_Thread_pools;

import java.util.concurrent.*;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newSingleThreadExecutor();

        pool.execute(() -> System.out.println("Log entry 1"));
        pool.execute(() -> System.out.println("Log entry 2"));
        pool.execute(() -> System.out.println("Log entry 3"));

        pool.shutdown();
    }
}
