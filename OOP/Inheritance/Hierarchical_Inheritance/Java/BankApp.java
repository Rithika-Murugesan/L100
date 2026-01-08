package L100.OOP.Inheritance.Hierarchical_Inheritance.Java;

class Account {
    protected String accountNumber;
    protected double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    double calculateInterest() {
        return 0;
    }
}

class Savings_Account extends Account {

    Savings_Account(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04; // 4% interest
    }
}

class Current_Account extends Account {

    Current_Account(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    double calculateInterest() {
        return 0; // No interest
    }
}

class Fixed_Deposit_Account extends Account {

    Fixed_Deposit_Account(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.07; // 7% interest
    }
}

public class BankApp {
    public static void main(String[] args) {

        Account acc1 = new Savings_Account("SB101", 100000);
        Account acc2 = new Current_Account("CA102", 50000);
        Account acc3 = new Fixed_Deposit_Account("FD103", 200000);

        System.out.println("Savings_Account - " + acc1.calculateInterest());
        System.out.println("Current_Account - " + acc2.calculateInterest());
        System.out.println("Fixed_Deposit_Account - " + acc3.calculateInterest());
    }
}
