using System;

class PaymentGateway
{
    public void ProcessPayment(double amount)
    {
        Console.WriteLine($"Payment of ₹{amount} processed successfully");
    }
}

class Order
{
    private PaymentGateway gateway; // Association

    // Constructor Injection
    public Order(PaymentGateway gateway)
    {
        this.gateway = gateway;
    }

    public void PlaceOrder(double amount)
    {
        Console.WriteLine("Placing order...");
        gateway.ProcessPayment(amount);
    }
}

class Program
{
    static void Main()
    {
        PaymentGateway gateway = new PaymentGateway(); // Independent
        Order order = new Order(gateway);               // Injected

        order.PlaceOrder(2200);
    }
}
