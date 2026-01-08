using System;

class NotificationService
{
    // Send SMS
    public void SendNotification(string mobileNumber, string message)
    {
        Console.WriteLine($"SMS sent to {mobileNumber}: {message}");
    }

    // Send Email
    public void SendNotification(string email, string subject, string message)
    {
        Console.WriteLine($"Email sent to {email}");
        Console.WriteLine($"Subject: {subject}");
        Console.WriteLine($"Message: {message}");
    }

    // Send Push Notification
    public void SendNotification(string deviceId, string message, bool isPush)
    {
        Console.WriteLine($"Push notification sent to device {deviceId}: {message}");
    }
}

class Program
{
    static void Main()
    {
        NotificationService service = new NotificationService();

        service.SendNotification("9876543210", "Your OTP is 4567");
        service.SendNotification("tce@mail.com", "Exam Result", "Your result is published");
        service.SendNotification("DEVICE123", "New assignment uploaded", true);
    }
}
