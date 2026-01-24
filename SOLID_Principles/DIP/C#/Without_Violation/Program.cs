namespace L100.SOLID_Principles.DIP.CSharp.Good_Design
{
    interface INotificationService
    {
        void Send(string message);
    }

class EmailService : INotificationService
{
        public void Send(string message)
        {
            System.Console.WriteLine("Sending email: " + message);
        }
}
class NotificationManager
{
        private readonly INotificationService notificationService;

        public NotificationManager(INotificationService notificationService)
        {
            this.notificationService = notificationService;
        }

        public void NotifyUser(string message)
        {
            notificationService.Send(message);
        }
}

class Email
{
        static void Main(string[] args)
        {
            INotificationService emailService = new EmailService();
            NotificationManager manager = new NotificationManager(emailService);
            manager.NotifyUser("Welcome to the application!");
        }
}
}