package L100.OOP.Inheritance.Hybrid_Inheritance.Java;

class Machine {
    void powerOn() {
        System.out.println("Machine powered on");
    }
}

interface Scannable {
    void scan();
}

interface NetworkPrintable {
    void printOverNetwork();
}

class OfficePrinter extends Machine
        implements Scannable, NetworkPrintable {

    public void scan() {
        System.out.println("Scanning document");
    }

    public void printOverNetwork() {
        System.out.println("Printing over network");
    }
}

public class Main {
    public static void main(String[] args) {
        OfficePrinter printer = new OfficePrinter();
        printer.powerOn();
        printer.scan();
        printer.printOverNetwork();
    }
}
