package L100.SOLID_Principles.OCP.Java.Good_design;

interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}

class SmsNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class NotificationService {

    private Notification notification;

    // Dependency Injection
    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void notifyUser(String message) {
        notification.send(message);
    }
}

public class Main {
    public static void main(String[] args) {

        Notification email = new EmailNotification();
        NotificationService emailService = new NotificationService(email);
        emailService.notifyUser("Welcome!");

        Notification sms = new SmsNotification();
        NotificationService smsService = new NotificationService(sms);
        smsService.notifyUser("OTP: 1234");
    }
}
