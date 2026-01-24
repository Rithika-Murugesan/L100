var EmailService = /** @class */ (function () {
    function EmailService() {
    }
    EmailService.prototype.send = function (message) {
        console.log("Sending email: " + message);
    };
    return EmailService;
}());
var NotificationManager = /** @class */ (function () {
    function NotificationManager(notificationService) {
        this.notificationService = notificationService;
    }
    NotificationManager.prototype.notifyUser = function (message) {
        this.notificationService.send(message);
    };
    return NotificationManager;
}());
var service = new EmailService();
var manager = new NotificationManager(service);
manager.notifyUser("Welcome to the application!");
