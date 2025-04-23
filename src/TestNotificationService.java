import notificationsreminders.ReminderService;
import java.time.LocalDateTime;

/**
 * Test class to demonstrate the ReminderService with email notifications
 */
public class TestNotificationService {
    public static void main(String[] args) {
        System.out.println("Testing Mail Notification Service");

        // Direct email test
        System.out.println("Testing direct email:");
        // Using the EmailNotification class from the root package
        EmailNotification.sendEmail(
            "muneebahmed115@outlook.com",
            "Direct Test Email",
            "This is a test email sent directly using EmailNotification class."
        );
        
        // Test the reminder service
        // Gmail app password - already stored in EmailNotification class
        String gmailAppPassword = "ilvi nkjk apdk hqmt"; 
        
        // Create and configure the reminder service
        System.out.println("\nConfiguring Reminder Service...");
        ReminderService reminderService = new ReminderService(gmailAppPassword);
        
        // Schedule an appointment reminder for 5 seconds from now
        LocalDateTime appointmentTime = LocalDateTime.now().plusSeconds(5);
        System.out.println("Scheduling appointment reminder for: " + appointmentTime);
        
        reminderService.scheduleAppointmentReminder(
            "muneebahmed115@outlook.com",  // recipient email
            "Dr. Smith",                   // doctor ID
            appointmentTime,               // appointment time 
            "Room 101"                     // location
        );
        
        // Check for reminders every second for 10 seconds
        System.out.println("Checking for reminders to send...");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000); // Wait for 1 second
                System.out.println("Checking reminders (" + (i+1) + "/10)...");
                reminderService.checkAndSendReminders();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Testing completed!");
    }
} 