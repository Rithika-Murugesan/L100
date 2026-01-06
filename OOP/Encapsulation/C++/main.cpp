#include "BankAccount.h"
#include <iostream>

int main() {
  BankAccount account(1000);

  account.deposit(500);
  account.withdraw(300);

  std::cout << "Balance:  " << account.getBalance() << std::endl;
  return 0;
}
