package L100.SOLID_Principles.OCP.Java.Violate_OCP;

class NotificationService {

    void sendNotification(String type, String message) {

        if (type.equalsIgnoreCase("EMAIL")) {
            sendEmail(message);
        } else if (type.equalsIgnoreCase("SMS")) {
            sendSMS(message);
        }
        // If WhatsApp is added → MODIFY this class again
    }

    private void sendEmail(String message) {
        System.out.println("Sending EMAIL: " + message);
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.sendNotification("EMAIL", "Welcome!");
        service.sendNotification("SMS", "OTP: 1234");
    }
}
