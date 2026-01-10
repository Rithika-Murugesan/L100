using System;
using System.Collections.Generic;

class OrderItem
{
    public string ProductName;
    public int Quantity;

    public OrderItem(string productName, int quantity)
    {
        ProductName = productName;
        Quantity = quantity;
    }
}

class Order
{
    private List<OrderItem> items = new List<OrderItem>(); // Composition

    public void AddItem(string productName, int quantity)
    {
        items.Add(new OrderItem(productName, quantity)); // created inside
    }

    public void ShowOrder()
    {
        Console.WriteLine("Order Items:");
        foreach (var item in items)
        {
            Console.WriteLine(item.ProductName + " - " + item.Quantity);
        }
    }
}

class Program
{
    static void Main()
    {
        Order order = new Order();
        order.AddItem("Laptop", 1);
        order.AddItem("Mouse", 2);

        order.ShowOrder();

        // Order deleted → OrderItems destroyed
        order = null;

        Console.WriteLine("Order deleted. OrderItems cannot exist independently.");
    }
}
