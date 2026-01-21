package L100.SOLID_Principles.LSP.Java.Bad_design;

abstract class Payment {
    // Contract: any payment can be refunded
    abstract void refund(double amount);
}

class CashOnDeliveryPayment extends Payment {

    // COD payments cannot be refunded electronically
    @Override
    void refund(double amount) { // Exceptions thrown...
        throw new UnsupportedOperationException(
                "Cash on Delivery refunds are not supported");
    }
}

public class PaymentService {

    public static void processRefund(Payment payment) {
        // Client trusts the parent contract
        payment.refund(500);
    }

    public static void main(String[] args) {
        Payment payment = new CashOnDeliveryPayment();
        processRefund(payment); // Runtime failure
    }
}
