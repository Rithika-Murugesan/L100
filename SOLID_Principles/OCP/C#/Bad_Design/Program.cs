using System;

class NotificationService
{
    public void SendNotification(string type, string message)
    {
        if (type.Equals("EMAIL", StringComparison.OrdinalIgnoreCase))
        {
            SendEmail(message);
        }
        else if (type.Equals("SMS", StringComparison.OrdinalIgnoreCase))
        {
            SendSMS(message);
        }
        // Adding WhatsApp → MODIFY this class again ❌
    }

    private void SendEmail(string message)
    {
        Console.WriteLine("Sending EMAIL: " + message);
    }

    private void SendSMS(string message)
    {
        Console.WriteLine("Sending SMS: " + message);
    }
}

class Program
{
    static void Main()
    {
        NotificationService service = new NotificationService();

        service.SendNotification("EMAIL", "Welcome!");
        service.SendNotification("SMS", "OTP: 1234");
    }
}
