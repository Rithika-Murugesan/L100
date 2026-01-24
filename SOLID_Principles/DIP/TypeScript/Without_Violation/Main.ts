// INotificationService.ts
interface INotificationService {
    send(message: string): void;
}


class EmailService implements INotificationService {
    send(message: string): void {
        console.log("Sending email: " + message);
    }
}
class NotificationManager {
    private notificationService: INotificationService;

    constructor(notificationService: INotificationService) {
        this.notificationService = notificationService;
    }

    notifyUser(message: string): void {
        this.notificationService.send(message);
    }
}
const service: INotificationService = new EmailService();
const manager = new NotificationManager(service);

manager.notifyUser("Welcome to the application!");

