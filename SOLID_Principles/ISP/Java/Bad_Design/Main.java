package L100.SOLID_Principles.ISP.Java.Bad_Design;

interface Employee {
    void writeCode();

    void conductInterview();

    void calculateSalary();
}

class Developer implements Employee {
    public void writeCode() {
        System.out.println("Writing code");
    }

    public void conductInterview() {
        throw new UnsupportedOperationException();
    }

    public void calculateSalary() {
        throw new UnsupportedOperationException();
    }
}

class HR implements Employee {
    public void writeCode() {
        throw new UnsupportedOperationException();
    }

    public void conductInterview() {
        System.out.println("Conducting interview");
    }

    public void calculateSalary() {
        throw new UnsupportedOperationException();
    }
}

public class Main {
    public static void main(String[] args) {

        Employee developer = new Developer();
        developer.writeCode();

        // Runtime Exception
        developer.conductInterview();

        Employee hr = new HR();
        hr.conductInterview();

        // Runtime Exception
        hr.writeCode();
    }
}
