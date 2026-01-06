export abstract class Payment {
    abstract pay(amount: number): void;

    startPayment(): void {
        console.log("Payment initiated");
    }
}
