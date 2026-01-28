package L100.Multithreading.Ways_to_Create_Thread.Using_Callable_and_Future;

import java.util.concurrent.*;

class ApiFetcher implements Callable<String> {
    private String apiName;

    public ApiFetcher(String apiName) {
        this.apiName = apiName;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000); // Simulate API delay
        return "Data from " + apiName;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<String> f1 = executor.submit(new ApiFetcher("WeatherAPI"));
        Future<String> f2 = executor.submit(new ApiFetcher("StockAPI"));

        System.out.println(f1.get()); // Waits for result
        System.out.println(f2.get());

        executor.shutdown();
    }
}
