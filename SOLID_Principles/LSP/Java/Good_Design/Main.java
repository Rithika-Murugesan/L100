package L100.SOLID_Principles.LSP.Java.Good_Design;

// Base abstraction: common payment behavior
abstract class Payment {
    abstract void pay(double amount);
}

interface Refundable {
    void refund(double amount);
}

class CreditCardPayment extends Payment implements Refundable {

    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Credit Card");
    }
}

class CashOnDeliveryPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash on Delivery");
    }
}

class RefundService {

    static void processRefund(Refundable payment) {
        payment.refund(500);
    }
}

public class Main {

    public static void main(String[] args) {

        Payment payment1 = new CreditCardPayment();
        payment1.pay(1000);

        Payment payment2 = new CashOnDeliveryPayment();
        payment2.pay(1000);

        Refundable refundablePayment = new CreditCardPayment();
        RefundService.processRefund(refundablePayment);

        // This is impossible now (compile-time safety)
        // Refundable wrong = new CashOnDeliveryPayment();
    }
}
