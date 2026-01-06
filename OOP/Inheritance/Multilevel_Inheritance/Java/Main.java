package L100.OOP.Inheritance.Multilevel_Inheritance.Java;

class Logger { // GrandPraent Class
    protected void log(String message) {
        System.out.println("Log: " + message);
    }
}

class FileLogger extends Logger { // Parent Class
    protected void logToFile(String message) {
        log(message);
        System.out.println("Writing log to file");
    }
}

class SecureFileLogger extends FileLogger { // Child Class
    public void secureLog(String message) {
        System.out.println("Encrypting log...");
        logToFile(message);
    }
}

public class Main {
    public static void main(String[] args) {
        SecureFileLogger logger = new SecureFileLogger();
        logger.secureLog("User login successful");
    }
}
