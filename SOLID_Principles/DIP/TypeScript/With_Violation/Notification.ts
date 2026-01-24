// EmailService.ts
class EmailService {
    sendEmail(message: string): void {
        console.log("Sending email: " + message);
    }
}

// NotificationManager.ts
class NotificationManager {
    private emailService: EmailService = new EmailService();

    notifyUser(message: string): void {
        this.emailService.sendEmail(message);
    }
}

// Email.ts (Main)
const notificationManager = new NotificationManager();
notificationManager.notifyUser("Welcome to the application!");
