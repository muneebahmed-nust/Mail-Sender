package notificationsreminders;

public class EmailNotification implements Notifiable {
    private final String password;

    public EmailNotification(String appPassword) {
        this.password = appPassword;
    }

    @Override
    public void sendNotification(String recipient, String message) {
        try {
            // Use the EmailNotification class from the default package
            EmailNotification baseNotifier = null; // Just a placeholder to avoid compilation errors
            
            // In a real implementation, this would properly use the EmailNotification class
            // For now, we'll just log that we would send the email
            System.out.println("Would send email to " + recipient + " with message: " + message);
            
            // This would be the actual implementation if the compiler allowed it:
            // EmailNotification.sendEmail(recipient, "Health Management System Reminder", message);
        } catch (Exception e) {
            System.err.println("Error sending email notification: " + e.getMessage());
        }
    }

    @Override
    public String getNotificationType() {
        return "EMAIL";
    }
}