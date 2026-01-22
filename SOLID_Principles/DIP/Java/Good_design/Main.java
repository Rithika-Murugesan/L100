package L100.SOLID_Principles.DIP.Java.Good_design;

interface NotificationService {
    void send(String message);
}

class EmailService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class NotificationManager {

    // Depends on abstraction
    private NotificationService notificationService;

    // Constructor Injection
    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message) {
        notificationService.send(message);
    }
}

public class Main {
    public static void main(String[] args) {

        NotificationService emailService = new EmailService();
        NotificationManager notificationManager = new NotificationManager(emailService);

        notificationManager.notifyUser("Welcome to the application!");
    }
}
