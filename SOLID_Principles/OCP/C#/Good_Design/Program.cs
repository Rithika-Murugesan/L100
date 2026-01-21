interface INotification
{
    void Send(string message);
}
class EmailNotification : INotification
{
    public void Send(string message)
    {
        Console.WriteLine("Sending EMAIL: " + message);
    }
}
class SmsNotification : INotification
{
    public void Send(string message)
    {
        Console.WriteLine("Sending SMS: " + message);
    }
}
class NotificationService
{
    private readonly INotification _notification;

    // Constructor Injection
    public NotificationService(INotification notification)
    {
        _notification = notification;
    }

    public void NotifyUser(string message)
    {
        _notification.Send(message);
    }
}
class Program
{
    static void Main()
    {
        INotification email = new EmailNotification();
        NotificationService emailService =
            new NotificationService(email);
        emailService.NotifyUser("Welcome!");

        INotification sms = new SmsNotification();
        NotificationService smsService =
            new NotificationService(sms);
        smsService.NotifyUser("OTP: 1234");
    }
}
