class CardPayment : Payment
{
    public override void Pay(double amount)
    {
        Console.WriteLine($"Paid ₹{amount} using Card");
    }
}
