//Scenario 1 - order = null
package L100.OOP.Association.Java.Independency.Scenario_1;

class PaymentGateway {
    void processPayment(double amount) {
        System.out.println("Payment of Rupees - " + amount + " processed successfully");
    }
}

class Order {
    private PaymentGateway gateway; // Association via instance variable

    // Dependency Injection
    Order(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    void placeOrder(double amount) {
        System.out.println("Placing order...");
        gateway.processPayment(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentGateway gateway = new PaymentGateway(); // Independent object
        Order order = new Order(gateway);
        System.out.println("Before breaking the reference to Order");
        order.placeOrder(1800); // Works fine

        order = null; // Break the reference to Order
        // Now we cannot call order.placeOrder anymore
        // But gateway still exists independently
        System.out.println("After breaking the reference to Order");
        gateway.processPayment(500); // Direct call still works
    }
}
