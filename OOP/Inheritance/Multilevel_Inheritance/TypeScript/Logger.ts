class Logger {
    protected log(message: string): void {
        console.log("Log:", message);
    }
}
class FileLogger extends Logger {
    protected logToFile(message: string): void {
        this.log(message);
        console.log("Writing log to file");
    }
}
class SecureFileLogger extends FileLogger {
    secureLog(message: string): void {
        console.log("Encrypting log...");
        this.logToFile(message);
    }
}
const logger = new SecureFileLogger();
logger.secureLog("API access granted");

