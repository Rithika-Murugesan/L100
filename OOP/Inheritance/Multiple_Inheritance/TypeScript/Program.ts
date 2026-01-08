interface EmailNotification {
    send(message: string): void;
}

interface SmsNotification {
    send(message: string): void;
}
class NotificationService implements EmailNotification, SmsNotification {

    send(message: string): void {
        console.log("Sending notification:", message);
    }
}
const email: EmailNotification = new NotificationService();
const sms: SmsNotification = new NotificationService();

email.send("Interview scheduled");
sms.send("OTP: 123456");
