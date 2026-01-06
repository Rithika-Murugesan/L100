"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.BankAccount = void 0;
// Export the class so other files can use it
var BankAccount = /** @class */ (function () {
    function BankAccount(initialBalance) {
        if (initialBalance < 0) {
            throw new Error("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }
    BankAccount.prototype.deposit = function (amount) {
        if (amount <= 0) {
            throw new Error("Deposit amount must be positive");
        }
        this.balance += amount;
    };
    BankAccount.prototype.withdraw = function (amount) {
        if (amount <= 0) {
            throw new Error("Withdraw amount must be positive");
        }
        if (amount > this.balance) {
            throw new Error("Insufficient balance");
        }
        this.balance -= amount;
    };
    BankAccount.prototype.getBalance = function () {
        return this.balance;
    };
    return BankAccount;
}());
exports.BankAccount = BankAccount;
