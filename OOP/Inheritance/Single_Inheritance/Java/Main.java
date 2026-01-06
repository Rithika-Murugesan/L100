
package L100.OOP.Inheritance.Single_Inheritance.Java;

class Student {
    int id;
    String name;

    void displayStudent() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class CollegeStudent extends Student {
    String department;

    void displayCollegeStudent() {
        displayStudent();
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        CollegeStudent s = new CollegeStudent();
        s.id = 101;
        s.name = "Rithika";
        s.department = "Computer Science";

        s.displayCollegeStudent();
    }
}
