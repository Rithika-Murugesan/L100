package L100.OOP.Inheritance.Multiple_Inheritance.Java;

interface EmailNotification {
    void send(String message);
}

interface SmsNotification {
    void send(String message);
}

class NotificationService implements EmailNotification, SmsNotification {

    @Override
    public void send(String message) {
        System.out.println("Sending notification: " + message);
    }
}

public class Main {
    public static void main(String[] args) {

        EmailNotification email = new NotificationService();
        SmsNotification sms = new NotificationService();

        email.send("Interview scheduled");
        sms.send("OTP: 123456");
    }
}
