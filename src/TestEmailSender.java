import notificationsreminders.ReminderService;
import java.time.LocalDateTime;

public class TestEmailSender {
    public static void main(String[] args) {
        System.out.println("Mail Sender Testing");

        // Test sending email directly
        sendDirectEmail();
        
        // Test with reminder service
        testReminderService();
        
        System.out.println("Mail testing completed!");
    }
    
    private static void sendDirectEmail() {
        System.out.println("Testing direct email sending...");
        // Using the EmailNotification class from the root package
        EmailNotification.sendEmail(
            "muneebahmed115@outlook.com", 
            "Direct Email Test", 
            "This is a test email sent directly from the EmailNotification class."
        );
    }
    
    private static void testReminderService() {
        System.out.println("\nTesting ReminderService...");
        // App password for Gmail
        String gmailAppPassword = "ilvi nkjk apdk hqmt"; 
        
        // Create ReminderService with the Gmail app password
        ReminderService reminderService = new ReminderService(gmailAppPassword);
        
        // Schedule an appointment reminder for 5 seconds from now
        LocalDateTime appointmentTime = LocalDateTime.now().plusSeconds(5);
        reminderService.scheduleAppointmentReminder(
            "muneebahmed115@outlook.com", // recipient email
            "Dr. Smith",                  // doctor ID
            appointmentTime,              // appointment time 
            "Room 101"                    // location
        );
        
        // Check for reminders every second for 10 seconds
        System.out.println("Checking for reminders to send...");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000); // Wait for 1 second
                System.out.println("Checking reminders...");
                reminderService.checkAndSendReminders();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
} 