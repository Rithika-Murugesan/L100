class Employee {  //Parent Class
    name: string;

    constructor(name: string) {
        this.name = name;
    }

    display(): void {
        console.log("Employee Name:", this.name);
    }
}
class Manager extends Employee {  //Child Class
    department: string;

    constructor(name: string, department: string) {
        super(name);
        this.department = department;
    }

    showDetails(): void {
        this.display();
        console.log("Department:", this.department);
    }
}
const m = new Manager("Rani", "Developer");
m.showDetails();
