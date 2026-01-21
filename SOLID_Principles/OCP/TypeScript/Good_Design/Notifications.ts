interface Notifications {
    send(message: string): void;
}
class EmailNotifications implements Notifications {
    send(message: string): void {
        console.log("Sending EMAIL:", message);
    }
}
class SmsNotifications implements Notifications {
    send(message: string): void {
        console.log("Sending SMS:", message);
    }
}
class NotificationServices {
    private notification: Notifications;

    constructor(notification: Notifications) {
        this.notification = notification;
    }

    notifyUser(message: string): void {
        this.notification.send(message);
    }
}
const emails = new EmailNotifications();
const emailService = new NotificationServices(emails);
emailService.notifyUser("Welcome!");

const sms = new SmsNotifications();
const smsService = new NotificationServices(sms);
smsService.notifyUser("OTP: 1234");
