using System;
class Employee
{
    public virtual double CalculateSalary()
    {
        return 0;
    }
}
class Permanent_Employee : Employee
{
    public override double CalculateSalary()
    {
        double baseSalary = 30000;
        double bonus = 5000;
        return baseSalary + bonus;
    }
}
class Contract_Employee : Employee
{
    public override double CalculateSalary()
    {
        int hours = 160;
        double ratePerHour = 200;
        return hours * ratePerHour;
    }
}
class Intern : Employee
{
    public override double CalculateSalary()
    {
        return 10000;
    }
}

class Program
{
    static void Main()
    {
        Employee emp;

        emp = new Permanent_Employee();
        Console.WriteLine($"Permanent Employee Salary: ₹{emp.CalculateSalary()}");

        emp = new Contract_Employee();
        Console.WriteLine($"Contract Employee Salary: ₹{emp.CalculateSalary()}");

        emp = new Intern();
        Console.WriteLine($"Intern Salary: ₹{emp.CalculateSalary()}");
    }
}

