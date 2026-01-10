package L100.OOP.Association.Java;

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
        Order order = new Order(gateway); // Injected, NOT owned

        order.placeOrder(1800);
    }
}
