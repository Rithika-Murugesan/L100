abstract class Payment {
    abstract pay(amount: number): void;
}
interface Refundable {
    refund(amount: number): void;
}
class CreditCardPayment extends Payment implements Refundable {
    pay(amount: number): void {
        console.log(`Paid ${amount} using Credit Card`);
    }

    refund(amount: number): void {
        console.log(`Refunded ${amount} to Credit Card`);
    }
}
class CashOnDeliveryPayment extends Payment {

    pay(amount: number): void {
        console.log(`Paid ${amount} using Cash on Delivery`);
    }
}
class RefundService {

    static processRefund(payment: Refundable): void {
        payment.refund(500);
    }
}
const payment1: Payment = new CreditCardPayment();
payment1.pay(1000);

const payment2: Payment = new CashOnDeliveryPayment();
payment2.pay(1000);

const refundable: Refundable = new CreditCardPayment();
RefundService.processRefund(refundable);

// Compile-time error (TypeScript)
// const wrong: Refundable = new CashOnDeliveryPayment();
