var NotificationService = /** @class */ (function () {
    function NotificationService() {
    }
    NotificationService.prototype.send = function (message) {
        console.log("Sending notification:", message);
    };
    return NotificationService;
}());
var email = new NotificationService();
var sms = new NotificationService();
email.send("Interview scheduled");
sms.send("OTP: 123456");
