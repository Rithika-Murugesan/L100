package L100.SOLID_Principles.DIP.Java.Bad_Design;

class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}

class NotificationManager {
    private EmailService emailService = new EmailService();

    public void notifyUser(String message) {
        emailService.sendEmail(message);
    }
}

public class Email {
    public static void main(String[] args) {

        NotificationManager notificationManager = new NotificationManager();
        notificationManager.notifyUser("Welcome to the application!");
    }
}
