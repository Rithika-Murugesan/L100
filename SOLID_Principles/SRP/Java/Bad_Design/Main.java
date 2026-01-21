package L100.SOLID_Principles.Java.Bad_Design;

class UserService {

    public boolean authenticate(String username, String password) {
        // Simulated authentication logic
        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Authentication successful");
            return true;
        } else {
            System.out.println("Authentication failed");
            return false;
        }
    }

    public void sendEmail(String message) {
        // Simulated email sending logic
        System.out.println("Sending email...");
        System.out.println("Email content: " + message);
        System.out.println("Email sent successfully");
    }
}

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();

        boolean isAuthenticated = userService.authenticate("admin", "1234");

        if (isAuthenticated) {
            userService.sendEmail("Welcome to the system!");
        }
    }
}
