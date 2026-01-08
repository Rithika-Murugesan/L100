class Account
{
    protected string AccountNumber;
    protected double Balance;

    public Account(string accountNumber, double balance)
    {
        AccountNumber = accountNumber;
        Balance = balance;
    }

    public virtual double CalculateInterest()
    {
        return 0;
    }
}
class SavingsAccount : Account
{
    public SavingsAccount(string accountNumber, double balance)
        : base(accountNumber, balance) { }

    public override double CalculateInterest()
    {
        return Balance * 0.04;
    }
}
class CurrentAccount : Account
{
    public CurrentAccount(string accountNumber, double balance)
        : base(accountNumber, balance) { }

    public override double CalculateInterest()
    {
        return 0;
    }
}
class FixedDepositAccount : Account
{
    public FixedDepositAccount(string accountNumber, double balance)
        : base(accountNumber, balance) { }

    public override double CalculateInterest()
    {
        return Balance * 0.07;
    }
}

public class Program
{
    public static void Main(string[] args)
    {
        Account acc1 = new SavingsAccount("SB101", 100000);
        Account acc2 = new CurrentAccount("CA102", 50000);
        Account acc3 = new FixedDepositAccount("FD103", 200000);

        Console.WriteLine("SavingsAccount - " + acc1.CalculateInterest());
        Console.WriteLine("CurrentAccount - " + acc2.CalculateInterest());
        Console.WriteLine("FixedDepositAccount - " + acc3.CalculateInterest());
    }
}
