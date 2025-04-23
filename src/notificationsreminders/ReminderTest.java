package notificationsreminders;

import java.time.LocalDateTime;
import java.util.Scanner;
public class ReminderTest {
    public static void main(String[] args) {
        // Replace with your Gmail app password
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Gmail app password: ");
        String gmailAppPassword = scanner.nextLine();
        
        // Create reminder service
        ReminderService reminderService = new ReminderService(gmailAppPassword);

        // Schedule an appointment reminder
        System.out.println("Scheduling appointment reminder...");
        reminderService.scheduleAppointmentReminder(
            "recipient@example.com",  // Replace with actual recipient email
            "Dr. Smith",
            LocalDateTime.now().plusMinutes(2),  // Appointment in 2 minutes
            "Main Hospital, Room 101"
        );

        // Schedule a medication reminder
        System.out.println("Scheduling medication reminder...");
        reminderService.scheduleMedicationReminder(
            "recipient@example.com",  // Replace with actual recipient email
            "Aspirin",
            LocalDateTime.now().plusMinutes(1),  // Reminder in 1 minute
            "1 tablet"
        );

        System.out.println("Reminders scheduled. Waiting to send...");
        
        // Wait for reminders to be sent
        try {
            Thread.sleep(120000); // Wait for 2 minutes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check and send reminders
        System.out.println("Checking and sending reminders...");
        reminderService.checkAndSendReminders();
    }
} 