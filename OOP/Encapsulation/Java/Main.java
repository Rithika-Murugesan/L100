package OOP.Encapsulation.Java;

import OOP.Encapsulation.Java.Bank_Account;

public class Main {
    public static void main(String[] args) {
        Bank_Account account = new Bank_Account(1000);

        account.deposit(500);
        account.withdraw(300);

        System.out.println("Balance:" + account.get_balance());
    }
}
