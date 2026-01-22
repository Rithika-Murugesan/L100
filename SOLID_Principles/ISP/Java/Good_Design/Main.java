package L100.SOLID_Principles.ISP.Java.Good_Design;

interface Coder {
    void writeCode();
}

interface Interviewer {
    void conductInterview();
}

interface SalaryCalculator {
    void calculateSalary();
}

class Developer implements Coder {

    @Override
    public void writeCode() {
        System.out.println("Developer is writing code");
    }
}

class HR implements Interviewer {

    @Override
    public void conductInterview() {
        System.out.println("HR is conducting interview");
    }
}

public class Main {
    public static void main(String[] args) {

        Coder developer = new Developer();
        developer.writeCode();

        Interviewer hr = new HR();
        hr.conductInterview();
    }
}