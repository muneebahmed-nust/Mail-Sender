import notificationsreminders.ReminderService;
import notificationsreminders.SMSNotification;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== Mail and SMS Notification Test ==========");

        // Test sending email directly using EmailNotification class
        System.out.println("\n----- Testing Direct Email Sending -----");
        EmailNotification.sendEmail(
            "muneebahmed115@outlook.com", 
            "Direct Email Test", 
            "This is a test email sent directly from the EmailNotification class."
        );

        // Test setting up a reminder with the ReminderService
        System.out.println("\n----- Testing ReminderService with Email and SMS -----");
        // App password for Gmail
        String gmailAppPassword = "ilvi nkjk apdk hqmt"; 
        
        // Create ReminderService with the Gmail app password
        ReminderService reminderService = new ReminderService(gmailAppPassword);
        
        // The ReminderService already adds both EmailNotification and SMSNotification
        // But we can explicitly add another SMSNotification to demonstrate
        System.out.println("Adding SMS notification service...");
        reminderService.addNotificationService(new SMSNotification());
        
        // Schedule an appointment reminder for 2 seconds from now
        LocalDateTime appointmentTime = LocalDateTime.now().plusSeconds(2);
        System.out.println("Scheduling appointment reminder for: " + appointmentTime);
        
        reminderService.scheduleAppointmentReminder(
            "muneebahmed115@outlook.com", // recipient email/phone
            "Dr. Smith",                  // doctor ID
            appointmentTime,              // appointment time 
            "Room 101"                    // location
        );
        
        // Schedule a medication reminder for 4 seconds from now
        LocalDateTime medicationTime = LocalDateTime.now().plusSeconds(4);
        System.out.println("Scheduling medication reminder for: " + medicationTime);
        
        reminderService.scheduleMedicationReminder(
            "muneebahmed115@outlook.com", // recipient email/phone
            "Amoxicillin",                // medication name
            medicationTime,               // reminder time
            "500mg"                       // dosage
        );
        
        // Check for reminders every second for 6 seconds
        System.out.println("\nChecking for reminders to send...");
        for (int i = 0; i < 6; i++) {
            try {
                System.out.println("\nCheck #" + (i+1) + "/6 at " + LocalDateTime.now());
                reminderService.checkAndSendReminders();
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n========== Notification Testing Completed ==========");
        System.out.println("Summary:");
        System.out.println("- Direct email sent");
        System.out.println("- Appointment reminder triggered email and SMS notifications");
        System.out.println("- Medication reminder triggered email and SMS notifications");
    }
}