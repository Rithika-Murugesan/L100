class Account {
    constructor(
        public accountNumber: string,
        protected balance: number
    ) { }

    calculateInterest(): number {
        return 0;
    }
}
class SavingsAccount extends Account {
    calculateInterest(): number {
        return this.balance * 0.04;
    }
}
class CurrentAccount extends Account {
    calculateInterest(): number {
        return 0;
    }
}
class FixedDepositAccount extends Account {
    calculateInterest(): number {
        return this.balance * 0.07;
    }
}

const acc1 = new SavingsAccount("SB101", 100000);
const acc2 = new CurrentAccount("CA102", 50000);
const acc3 = new FixedDepositAccount("FD103", 200000);

console.log("SavingsAccount - " + acc1.calculateInterest());
console.log("CurrentAccount - " + acc2.calculateInterest());
console.log("FixedDepositAccount - " + acc3.calculateInterest());
