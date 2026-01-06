public class Main {
    public static void main(String[] args) {
        Payment payment = new CardPayment(); // abstraction
        payment.paymentStarted();
        payment.pay(500);
    }
}
