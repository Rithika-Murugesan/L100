abstract class Payment
{
    public abstract void Pay(double amount);

    public void PaymentStarted()
    {
        Console.WriteLine("Payment initiated");
    }
}
