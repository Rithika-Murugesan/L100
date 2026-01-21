// Contract: any payment can be refunded
abstract class Payment {
    abstract refund(amount: number): void;
}

class CashOnDeliveryPayment extends Payment {

    // COD payments cannot be refunded electronically
    refund(amount: number): void {
        throw new Error("Cash on Delivery refunds are not supported");
    }
}

class PaymentService {

    static processRefund(payment: Payment): void {
        // Client trusts the parent contract
        payment.refund(500);
    }
}

// Client code
const payment: Payment = new CashOnDeliveryPayment();
PaymentService.processRefund(payment); // Runtime failure ❌
