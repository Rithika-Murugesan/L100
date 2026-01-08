class NotificationService {

    // Method signatures
    sendNotification(mobileNumber: string, message: string): void;
    sendNotification(email: string, subject: string, message: string): void;
    sendNotification(deviceId: string, message: string, isPush: boolean): void;


    sendNotification(id: string, arg2: string, arg3?: string | boolean): void {
        if (typeof arg3 === "boolean") {
            console.log(`Push notification sent to device ${id}: ${arg2}`);
        } else if (typeof arg3 === "string") {
            console.log(`Email sent to ${id}`);
            console.log(`Subject: ${arg2}`);
            console.log(`Message: ${arg3}`);
        } else {
            console.log(`SMS sent to ${id}: ${arg2}`);
        }
    }
}

const service = new NotificationService();

service.sendNotification("9876543210", "Your OTP is 4567");
service.sendNotification("user@mail.com", "Exam Result", "Your result is published");
service.sendNotification("DEVICE123", "New assignment uploaded", true);


