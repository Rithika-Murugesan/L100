#ifndef BANKACCOUNT_H
#define BANKACCOUNT_H

class BankAccount {
private:
  double balance;

public:
  BankAccount(double initialBalance);
  void deposit(double amount);
  void withdraw(double amount);
  double getBalance() const;
};

#endif
