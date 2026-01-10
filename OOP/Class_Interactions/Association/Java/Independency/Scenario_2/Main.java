package L100.OOP.Association.Java.Independency.Scenario_2;

//Scenario 2 - gateway = null

class PaymentGateway {
    void processPayment(double amount) {
        System.out.println("Payment of Rupees - " + amount + " processed successfully");
    }
}

class Order {
    public PaymentGateway gateway; // Association via instance variable

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
        PaymentGateway gateway = new PaymentGateway();
        Order order = new Order(gateway);

        order.placeOrder(1800); // Works fine

        gateway = null; // Break the reference to PaymentGateway

        order.gateway = null; // break association
        order.placeOrder(2000); // NullPointerException
    }
}
