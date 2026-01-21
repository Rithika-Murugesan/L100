
class UserServices {

    authenticate(username: string, password: string): boolean {
        // Simulated authentication logic
        if (username === "admin" && password === "1234") {
            console.log("Authentication successful");
            return true;
        } else {
            console.log("Authentication failed");
            return false;
        }
    }

    sendEmail(message: string): void {
        // Simulated email sending logic
        console.log("Sending email...");
        console.log("Email content: " + message);
        console.log("Email sent successfully");
    }
}

const userServices = new UserServices();

const is_Authenticated = userServices.authenticate("admin", "1234");

if (is_Authenticated) {
    userServices.sendEmail("Welcome to the system!");
}


