abstract class Payment {
    abstract void pay(double amount);

    void paymentStarted() {
        System.out.println("Payment initiated");
    }
}
