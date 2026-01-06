using System;

class Logger  //GrandParent
{
    protected void Log(string message)
    {
        Console.WriteLine("Log: " + message);
    }
}
class FileLogger : Logger //Parent
{
    protected void LogToFile(string message)
    {
        Log(message);
        Console.WriteLine("Writing log to file");
    }
}

class SecureFileLogger : FileLogger   //Child Class
{
    public void SecureLog(string message)
    {
        Console.WriteLine("Encrypting log...");
        LogToFile(message);
    }
}

class Program
{
    static void Main()
    {
        SecureFileLogger logger = new SecureFileLogger();
        logger.SecureLog("Payment processed successfully");
    }
}
