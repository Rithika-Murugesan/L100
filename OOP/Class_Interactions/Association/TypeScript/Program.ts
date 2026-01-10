class PaymentGateway {
    processPayment(amount: number): void {
        console.log(`Payment of ₹${amount} processed successfully`);
    }
}

class Order {
    private gateway: PaymentGateway; // Association

    constructor(gateway: PaymentGateway) {
        this.gateway = gateway; // Injected
    }

    placeOrder(amount: number): void {
        console.log("Placing order...");
        this.gateway.processPayment(amount);
    }
}

// Execution
const gateway = new PaymentGateway(); // Independent
const order = new Order(gateway);     // Injected

order.placeOrder(3000);
