package L100.Multithreading.Ways_to_Create_Thread.Implementing_Runnable;

class RequestHandler implements Runnable { // Inside Runnable...we define tasks....
    private String request;

    public RequestHandler(String request) {
        this.request = request;
    }

    @Override
    public void run() {
        System.out.println("Processing request: " + request);
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RequestHandler("User Login"));
        Thread t2 = new Thread(new RequestHandler("Data Upload"));
        t1.start();
        t2.start();
    }
}
