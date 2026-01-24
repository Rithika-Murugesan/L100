namespace L100.SOLID_Principles.DIP.CSharp.Bad_Design
{
    class EmailService
    {
        public void SendEmail(string message)
        {
            System.Console.WriteLine("Sending email: " + message);
        }
    }

    class NotificationManager
    {
        private EmailService emailService = new EmailService();

        public void NotifyUser(string message)
        {
            emailService.SendEmail(message);
        }
    }

    class Email
    {
        static void Main(string[] args)
        {
            NotificationManager notificationManager = new NotificationManager();
            notificationManager.NotifyUser("Welcome to the application!");
        }
    }
}
