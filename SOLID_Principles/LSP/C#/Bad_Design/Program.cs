using System;

namespace L100.SOLID_Principles.LSP.CSharp.Bad_Design
{
    // Contract: any payment can be refunded
    abstract class Payment
    {
        public abstract void Refund(double amount);
    }

    class CashOnDeliveryPayment : Payment
    {
        // COD payments cannot be refunded electronically
        public override void Refund(double amount)
        {
            throw new NotSupportedException(
                "Cash on Delivery refunds are not supported");
        }
    }

    class PaymentService
    {
        public static void ProcessRefund(Payment payment)
        {
            // Client trusts the parent contract
            payment.Refund(500);
        }

        static void Main(string[] args)
        {
            Payment payment = new CashOnDeliveryPayment();
            ProcessRefund(payment); // Runtime failure 
        }
    }
}
