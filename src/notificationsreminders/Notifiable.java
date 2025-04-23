package notificationsreminders;

public interface Notifiable {
    void sendNotification(String recipient, String message);
    String getNotificationType();
} 