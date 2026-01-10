class OrderItem {
    productName: string;
    quantity: number;

    constructor(productName: string, quantity: number) {
        this.productName = productName;
        this.quantity = quantity;
    }
}

class Orders {
    private items: OrderItem[] = []; // Composition

    addItems(productName: string, quantity: number): void {
        this.items.push(new OrderItem(productName, quantity)); // created inside
    }

    showOrders(): void {
        console.log("Order Items:");
        this.items.forEach(item =>
            console.log(`${item.productName} - ${item.quantity}`)
        );
    }
}

// Execution
let orders: Orders | null = new Orders();
orders.addItems("Laptop", 1);
orders.addItems("Mouse", 2);

orders.showOrders();

// Order deleted → OrderItems gone
orders = null;

console.log("Order deleted. OrderItems cannot exist independently.");
