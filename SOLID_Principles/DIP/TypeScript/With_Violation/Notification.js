// EmailService.ts
var EmailService = /** @class */ (function () {
    function EmailService() {
    }
    EmailService.prototype.sendEmail = function (message) {
        console.log("Sending email: " + message);
    };
    return EmailService;
}());
// NotificationManager.ts
var NotificationManager = /** @class */ (function () {
    function NotificationManager() {
        this.emailService = new EmailService();
    }
    NotificationManager.prototype.notifyUser = function (message) {
        this.emailService.sendEmail(message);
    };
    return NotificationManager;
}());
// Email.ts (Main)
var notificationManager = new NotificationManager();
notificationManager.notifyUser("Welcome to the application!");
