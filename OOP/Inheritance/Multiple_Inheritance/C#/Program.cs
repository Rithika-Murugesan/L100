interface IEmailNotification
{
    void Send(string message);
}

interface ISmsNotification
{
    void Send(string message);
}
class NotificationService : IEmailNotification, ISmsNotification
{
    public void Send(string message)
    {
        Console.WriteLine("Sending notification: " + message);
    }
}
class Program
{
    static void Main()
    {
        IEmailNotification email = new NotificationService();
        ISmsNotification sms = new NotificationService();

        email.Send("Interview scheduled");
        sms.Send("OTP: 123456");
    }
}
