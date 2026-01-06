package OOP.Encapsulation.Java;

public class Bank_Account {
    private double balance;

    public Bank_Account(double initial_balance) {
        if (initial_balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initial_balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient balance");
        }
        balance -= amount;
    }

    public double get_balance() {
        return balance;
    }
}
