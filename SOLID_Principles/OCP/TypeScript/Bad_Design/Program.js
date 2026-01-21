var NotificationService = /** @class */ (function () {
    function NotificationService() {
    }
    NotificationService.prototype.sendNotification = function (type, message) {
        if (type === "EMAIL") {
            this.sendEmail(message);
        }
        else if (type === "SMS") {
            this.sendSMS(message);
        }
        // Adding Push / WhatsApp → MODIFY this class
    };
    NotificationService.prototype.sendEmail = function (message) {
        console.log("Sending EMAIL:", message);
    };
    NotificationService.prototype.sendSMS = function (message) {
        console.log("Sending SMS:", message);
    };
    return NotificationService;
}());
var service = new NotificationService();
service.sendNotification("EMAIL", "Welcome!");
service.sendNotification("SMS", "OTP: 1234");
