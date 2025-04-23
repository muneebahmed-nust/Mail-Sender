package notificationsreminders;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReminderService {
    private List<Notifiable> notificationServices;
    private List<Reminder> reminders;

    public ReminderService(String gmailAppPassword) {
        notificationServices = new ArrayList<>();
        reminders = new ArrayList<>();

        // Add email notification service with Gmail configuration
        notificationServices.add(new EmailNotification(gmailAppPassword));
        notificationServices.add(new SMSNotification());
    }

    public void addNotificationService(Notifiable service) {
        notificationServices.add(service);
    }

    public void scheduleAppointmentReminder(String patientId, String doctorId,
                                          LocalDateTime appointmentTime, String location) {
        String message = String.format(
            "Appointment Reminder:\nDoctor: %s\nTime: %s\nLocation: %s",
            doctorId, appointmentTime.toString(), location
        );
        reminders.add(new Reminder(patientId, message, appointmentTime.minusHours(1)));
    }

    public void scheduleMedicationReminder(String patientId, String medicationName,
                                         LocalDateTime reminderTime, String dosage) {
        String message = String.format(
            "Medication Reminder:\nTake %s of %s",
            dosage, medicationName
        );
        reminders.add(new Reminder(patientId, message, reminderTime));
    }

    public void checkAndSendReminders() {
        LocalDateTime now = LocalDateTime.now();
        List<Reminder> toRemove = new ArrayList<>();

        for (Reminder reminder : reminders) {
            if (reminder.getReminderTime().isBefore(now) ||
                reminder.getReminderTime().isEqual(now)) {
                sendReminder(reminder);
                toRemove.add(reminder);
            }
        }

        reminders.removeAll(toRemove);
    }

    private void sendReminder(Reminder reminder) {
        for (Notifiable service : notificationServices) {
            service.sendNotification(reminder.getRecipientId(), reminder.getMessage());
        }
    }

    private static class Reminder {
        private String recipientId;
        private String message;
        private LocalDateTime reminderTime;

        public Reminder(String recipientId, String message, LocalDateTime reminderTime) {
            this.recipientId = recipientId;
            this.message = message;
            this.reminderTime = reminderTime;
        }

        public String getRecipientId() {
            return recipientId;
        }

        public String getMessage() {
            return message;
        }

        public LocalDateTime getReminderTime() {
            return reminderTime;
        }
    }
}
