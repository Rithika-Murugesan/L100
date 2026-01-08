var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Account = /** @class */ (function () {
    function Account(accountNumber, balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    Account.prototype.calculateInterest = function () {
        return 0;
    };
    return Account;
}());
var SavingsAccount = /** @class */ (function (_super) {
    __extends(SavingsAccount, _super);
    function SavingsAccount() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    SavingsAccount.prototype.calculateInterest = function () {
        return this.balance * 0.04;
    };
    return SavingsAccount;
}(Account));
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    CurrentAccount.prototype.calculateInterest = function () {
        return 0;
    };
    return CurrentAccount;
}(Account));
var FixedDepositAccount = /** @class */ (function (_super) {
    __extends(FixedDepositAccount, _super);
    function FixedDepositAccount() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    FixedDepositAccount.prototype.calculateInterest = function () {
        return this.balance * 0.07;
    };
    return FixedDepositAccount;
}(Account));
var acc1 = new SavingsAccount("SB101", 100000);
var acc2 = new CurrentAccount("CA102", 50000);
var acc3 = new FixedDepositAccount("FD103", 200000);
console.log("SavingsAccount - " + acc1.calculateInterest());
console.log("CurrentAccount - " + acc2.calculateInterest());
console.log("FixedDepositAccount - " + acc3.calculateInterest());
