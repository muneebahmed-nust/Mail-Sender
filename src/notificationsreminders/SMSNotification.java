package notificationsreminders;

public class SMSNotification implements Notifiable {
    @Override
    public void sendNotification(String recipient, String message) {
        // In a real application, this would connect to an SMS gateway service
        System.out.println("Sending SMS to: " + recipient);
        System.out.println("Message: " + message);
        System.out.println("SMS sent successfully!");
    }

    @Override
    public String getNotificationType() {
        return "SMS";
    }
} 