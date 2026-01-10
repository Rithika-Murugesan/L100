package L100.OOP.Class_Interactions.Composition.Java;

import java.util.ArrayList;
import java.util.List;

class OrderItem {
    String productName;
    int quantity;

    OrderItem(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }
}

class Order {
    private List<OrderItem> items = new ArrayList<>(); // Composition

    void addItem(String productName, int quantity) {
        items.add(new OrderItem(productName, quantity)); // created inside
    }

    void showOrder() {
        System.out.println("Order Items:");
        for (OrderItem item : items) {
            System.out.println(item.productName + " - " + item.quantity);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Order order = new Order();
        order.addItem("Laptop", 1);
        order.addItem("Mouse", 2);

        order.showOrder();

        // Order deleted → OrderItems automatically gone
        order = null;
        // order.showOrder(); - Throws exception because order_items are null...
        System.out.println("Order deleted. OrderItems cannot exist independently.");
    }
}
