class Program
{
    static void Main()
    {
        Payment payment = new CardPayment(); // abstraction
        payment.PaymentStarted();
        payment.Pay(500);
    }
}
