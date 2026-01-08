var NotificationService = /** @class */ (function () {
    function NotificationService() {
    }
    // Implementation
    NotificationService.prototype.sendNotification = function (id, arg2, arg3) {
        if (typeof arg3 === "boolean") {
            console.log("Push notification sent to device ".concat(id, ": ").concat(arg2));
        }
        else if (typeof arg3 === "string") {
            console.log("Email sent to ".concat(id));
            console.log("Subject: ".concat(arg2));
            console.log("Message: ".concat(arg3));
        }
        else {
            console.log("SMS sent to ".concat(id, ": ").concat(arg2));
        }
    };
    return NotificationService;
}());
var service = new NotificationService();
service.sendNotification("9876543210", "Your OTP is 4567");
service.sendNotification("user@mail.com", "Exam Result", "Your result is published");
service.sendNotification("DEVICE123", "New assignment uploaded", true);
