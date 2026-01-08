class Employee {
    calculateSalary(): number {
        return 0;
    }
}
class Permanent_Employee extends Employee {
    calculateSalary(): number {
        return 30000 + 5000;
    }
}
class Contract_Employee extends Employee {
    calculateSalary(): number {
        const hours = 160;
        const ratePerHour = 200;
        return hours * ratePerHour;
    }
}
class Intern extends Employee {
    calculateSalary(): number {
        return 10000;
    }
}
let emp: Employee;

emp = new Permanent_Employee();
console.log("Permanent Employee Salary: Rupees - " + emp.calculateSalary());

emp = new Contract_Employee();
console.log("Contract Employee Salary: Rupees - " + emp.calculateSalary());

emp = new Intern();
console.log("Intern Salary: Rupees - " + emp.calculateSalary());
