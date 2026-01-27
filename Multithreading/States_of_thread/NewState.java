package L100.Multithreading.States_of_thread;

class NewState {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Running..."));
        System.out.println("State: " + t.getState()); // NEW
    }
}
