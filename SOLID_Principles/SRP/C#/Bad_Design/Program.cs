using System;

namespace L100.SOLID_Principles.CSharp.Bad_Design
{
    class UserService
    {
        public bool Authenticate(string username, string password)
        {
            // Simulated authentication logic
            if (username == "admin" && password == "1234")
            {
                Console.WriteLine("Authentication successful");
                return true;
            }
            else
            {
                Console.WriteLine("Authentication failed");
                return false;
            }
        }

        public void SendEmail(string message)
        {
            // Simulated email sending logic
            Console.WriteLine("Sending email...");
            Console.WriteLine("Email content: " + message);
            Console.WriteLine("Email sent successfully");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            UserService userService = new UserService();

            bool isAuthenticated = userService.Authenticate("admin", "1234");

            if (isAuthenticated)
            {
                userService.SendEmail("Welcome to the system!");
            }
        }
    }
}
