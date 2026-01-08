class Machine {
    powerOn(): void {
        console.log("Machine powered on");
    }
}
interface Scannable {
    scan(): void;
}

interface NetworkPrintable {
    printOverNetwork(): void;
}
class OfficePrinter extends Machine
    implements Scannable, NetworkPrintable {

    scan(): void {
        console.log("Scanning document");
    }

    printOverNetwork(): void {
        console.log("Printing over network");
    }
}
const printer = new OfficePrinter();
printer.powerOn();
printer.scan();
printer.printOverNetwork();
