// Import the class from BankAccount.ts
import { BankAccount } from './BankAccount.js';

const account = new BankAccount(1000);

account.deposit(500);
account.withdraw(300);

console.log(`Balance: ₹${account.getBalance()}`);
