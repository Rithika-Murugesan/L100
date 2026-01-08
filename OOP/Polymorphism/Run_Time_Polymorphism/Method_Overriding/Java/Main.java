package L100.OOP.Polymorphism.Run_Time_Polymorphism.Method_Overriding.Java;

class Employee {
    double calculate_salary() {
        return 0;
    }
}

class Permanent_Employee extends Employee {

    @Override
    double calculate_salary() {
        double base = 30000;
        double bonus = 5000;
        return base + bonus;
    }
}

class Contract_Employee extends Employee {

    @Override
    double calculate_salary() {
        int hours = 160;
        double ratePerHour = 200;
        return hours * ratePerHour;
    }
}

class Intern extends Employee {

    @Override
    double calculate_salary() {
        return 10000;
    }
}

public class Main {
    public static void main(String[] args) {

        Employee emp;

        emp = new Permanent_Employee(); // Parent reference → Child object (Overriding)
        System.out.println("Permanent Employee Salary: Rupees - " + emp.calculate_salary());

        emp = new Contract_Employee();
        System.out.println("Contract Employee Salary: Rupees - " + emp.calculate_salary());

        emp = new Intern();
        System.out.println("Intern Salary: Rupees - " + emp.calculate_salary());
    }
}
