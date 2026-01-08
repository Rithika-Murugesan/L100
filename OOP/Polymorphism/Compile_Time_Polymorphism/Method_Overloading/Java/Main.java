package L100.OOP.Polymorphism.Compile_Time_Polymorphism.Method_Overloading.Java;

class NotificationService {

    // Send SMS
    void sendNotification(String mobileNumber, String message) {
        System.out.println("SMS sent to " + mobileNumber + ": " + message);
    }

    // Send Email
    void sendNotification(String email, String subject, String message) {
        System.out.println("Email sent to " + email);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
    }

    // Send Push Notification
    void sendNotification(String deviceId, String message, boolean isPush) {
        System.out.println("Push notification sent to device " + deviceId + ": " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.sendNotification("9876543210", "Your OTP is 4567");
        service.sendNotification("tce@gmail.com", "Exam Result", "Your result is published");
        service.sendNotification("DEVICE123", "New assignment uploaded", true);
    }
}
