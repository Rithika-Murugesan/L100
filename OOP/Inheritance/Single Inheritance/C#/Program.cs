using System;
class Device
{
    public string Brand;

    public void ShowBrand()
    {
        Console.WriteLine("Brand: " + Brand);
    }
}
class Mobile : Device
{
    public string Model;

    public void ShowDetails()
    {
        ShowBrand();
        Console.WriteLine("Model: " + Model);
    }
}

class Program
{
    static void Main()
    {
        Mobile m = new Mobile();
        m.Brand = "Samsung";
        m.Model = "S23";

        m.ShowDetails();
    }
}
