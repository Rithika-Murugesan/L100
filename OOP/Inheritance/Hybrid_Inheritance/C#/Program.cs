class Machine
{
    public void PowerOn()
    {
        Console.WriteLine("Machine powered on");
    }
}
interface IScannable
{
    void Scan();
}

interface INetworkPrintable
{
    void PrintOverNetwork();
}
class OfficePrinter : Machine, IScannable, INetworkPrintable
{
    public void Scan()
    {
        Console.WriteLine("Scanning document");
    }

    public void PrintOverNetwork()
    {
        Console.WriteLine("Printing over network");
    }
}
class Program
{
    static void Main()
    {
        OfficePrinter printer = new OfficePrinter();
        printer.PowerOn();
        printer.Scan();
        printer.PrintOverNetwork();
    }
}
