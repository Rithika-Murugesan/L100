// UserService.ts
var UserService = /** @class */ (function () {
    function UserService() {
    }
    UserService.prototype.authenticate = function (username, password) {
        // Simulated authentication logic
        if (username === "admin" && password === "1234") {
            console.log("Authentication successful");
            return true;
        }
        else {
            console.log("Authentication failed");
            return false;
        }
    };
    UserService.prototype.sendEmail = function (message) {
        // Simulated email sending logic
        console.log("Sending email...");
        console.log("Email content: " + message);
        console.log("Email sent successfully");
    };
    return UserService;
}());
// Main.ts
var userService = new UserService();
var isAuthenticated = userService.authenticate("admin", "1234");
if (isAuthenticated) {
    userService.sendEmail("Welcome to the system!");
}
