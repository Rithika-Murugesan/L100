import { Payment } from "./Payment";

export class CardPayment extends Payment {
    pay(amount: number): void {
        console.log(`Paid ₹${amount} using Card`);
    }
}
