"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
// Import the class from BankAccount.ts
var BankAccount_js_1 = require("./BankAccount.js");
var account = new BankAccount_js_1.BankAccount(1000);
account.deposit(500);
account.withdraw(300);
console.log("Balance: \u20B9".concat(account.getBalance()));
