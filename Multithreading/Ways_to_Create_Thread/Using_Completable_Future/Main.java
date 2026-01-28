package L100.Multithreading.Ways_to_Create_Thread.Using_Completable_Future;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            return "User profile loaded!";
        }).thenAccept(result -> System.out.println(result));

        System.out.println("Main thread continues working...");
    }
}
