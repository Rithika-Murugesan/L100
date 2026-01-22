using System;
namespace L100.SOLID_Principles.LSP.CSharp.Good_Design
{
    // Base abstraction: common payment behavior
    abstract class Payment
    {
        public abstract void Pay(double amount);
    }
    interface IRefundable
    {
        void Refund(double amount);
    }
    class CreditCardPayment : Payment, IRefundable
    {
        public override void Pay(double amount)
        {
            Console.WriteLine($"Paid {amount} using Credit Card");
        }

        public void Refund(double amount)
        {
            Console.WriteLine($"Refunded {amount} to Credit Card");
        }
    }
    class CashOnDeliveryPayment : Payment
    {
        public override void Pay(double amount)
        {
            Console.WriteLine($"Paid {amount} using Cash on Delivery");
        }
    }
    class RefundService
    {
        public static void ProcessRefund(IRefundable payment)
        {
            payment.Refund(500);
        }
    }
    class PaymentService
    {
        static void Main(string[] args)
        {
            Payment payment1 = new CreditCardPayment();
            payment1.Pay(1000);

            Payment payment2 = new CashOnDeliveryPayment();
            payment2.Pay(1000);

            IRefundable refundable = new CreditCardPayment();
            RefundService.ProcessRefund(refundable);

            // Compile-time error (LSP protected)
            // IRefundable wrong = new CashOnDeliveryPayment();
        }
    }
}
