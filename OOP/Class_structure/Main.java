
class Student {
    int id; // data member
    String name;

    Student(int id, String name) { // constructor
        this.id = id;
        this.name = name;
    }

    void display() { // method
        System.out.println(id + " " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student(101, "Ram");
        stud1.display();
        Student stud2 = new Student(102, "Raja");
        stud2.display();
        Student stud3 = new Student(103, "Rani");
        stud3.display();
    }
}