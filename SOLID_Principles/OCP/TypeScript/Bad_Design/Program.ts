class NotificationService {

    sendNotification(type: string, message: string): void {

        if (type === "EMAIL") {
            this.sendEmail(message);
        }
        else if (type === "SMS") {
            this.sendSMS(message);
        }
        // Adding Push / WhatsApp → MODIFY this class
    }

    private sendEmail(message: string): void {
        console.log("Sending EMAIL:", message);
    }

    private sendSMS(message: string): void {
        console.log("Sending SMS:", message);
    }
}
const service = new NotificationService();

service.sendNotification("EMAIL", "Welcome!");
service.sendNotification("SMS", "OTP: 1234");
