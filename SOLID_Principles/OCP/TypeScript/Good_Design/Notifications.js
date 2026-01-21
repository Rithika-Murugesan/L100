var EmailNotifications = /** @class */ (function () {
    function EmailNotifications() {
    }
    EmailNotifications.prototype.send = function (message) {
        console.log("Sending EMAIL:", message);
    };
    return EmailNotifications;
}());
var SmsNotifications = /** @class */ (function () {
    function SmsNotifications() {
    }
    SmsNotifications.prototype.send = function (message) {
        console.log("Sending SMS:", message);
    };
    return SmsNotifications;
}());
var NotificationServices = /** @class */ (function () {
    function NotificationServices(notification) {
        this.notification = notification;
    }
    NotificationServices.prototype.notifyUser = function (message) {
        this.notification.send(message);
    };
    return NotificationServices;
}());
var emails = new EmailNotifications();
var emailService = new NotificationServices(emails);
emailService.notifyUser("Welcome!");
var sms = new SmsNotifications();
var smsService = new NotificationServices(sms);
smsService.notifyUser("OTP: 1234");
