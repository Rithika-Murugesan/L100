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
var Employee = /** @class */ (function () {
    function Employee() {
    }
    Employee.prototype.calculateSalary = function () {
        return 0;
    };
    return Employee;
}());
var Permanent_Employee = /** @class */ (function (_super) {
    __extends(Permanent_Employee, _super);
    function Permanent_Employee() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Permanent_Employee.prototype.calculateSalary = function () {
        return 30000 + 5000;
    };
    return Permanent_Employee;
}(Employee));
var Contract_Employee = /** @class */ (function (_super) {
    __extends(Contract_Employee, _super);
    function Contract_Employee() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Contract_Employee.prototype.calculateSalary = function () {
        var hours = 160;
        var ratePerHour = 200;
        return hours * ratePerHour;
    };
    return Contract_Employee;
}(Employee));
var Intern = /** @class */ (function (_super) {
    __extends(Intern, _super);
    function Intern() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Intern.prototype.calculateSalary = function () {
        return 10000;
    };
    return Intern;
}(Employee));
var emp;
emp = new Permanent_Employee();
console.log("Permanent Employee Salary: Rupees - " + emp.calculateSalary());
emp = new Contract_Employee();
console.log("Contract Employee Salary: Rupees - " + emp.calculateSalary());
emp = new Intern();
console.log("Intern Salary: Rupees - " + emp.calculateSalary());
