package people;

import java.time.LocalDateTime;
import java.util.List;

public class Patient extends User {
    String patientId;

    public Patient(String name, String phoneNumber, String email, String password, String dateOfBirth, String cnic, Gender gender, String patientId) {
        super(name, phoneNumber, email, password, dateOfBirth, cnic, gender);
        this.patientId = patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId=patientId;
    }
   
//
//    public String getPatientId() {
//        return patientId;
//    }
//
//    public void bookAppointment(String doctorId, LocalDateTime appointmentDateTime, String reason) {
//        filehandling.AppointmentHandler appointmentHandler = new filehandling.AppointmentHandler();
//
//        // Generate a new appointment ID
//        int appointmentId = appointmentHandler.generateAppointmentId();
//
//        // Create the appointment
//        things.Appointment appointment = new things.Appointment(
//            appointmentId,
//            doctorId,
//            this.patientId,
//            appointmentDateTime,
//            reason
//        );
//
//        // Save the appointment
//        appointmentHandler.createAppointment(appointment);
//
//        System.out.println("Appointment booked successfully with ID: " + appointmentId);
//    }
//
//    public void viewMyAppointments() {
//        filehandling.AppointmentHandler appointmentHandler = new filehandling.AppointmentHandler();
//        List<things.Appointment> myAppointments = appointmentHandler.getPatientAppointments(this.patientId);
//
//        if (myAppointments.isEmpty()) {
//            System.out.println("You have no appointments.");
//        } else {
//            System.out.println("Your appointments:");
//            for (things.Appointment appointment : myAppointments) {
//                System.out.println("----------------------------");
//                System.out.println(appointment);
//            }
//        }
//    }
//
//    public void cancelAppointment(int appointmentId) {
//        filehandling.AppointmentHandler appointmentHandler = new filehandling.AppointmentHandler();
//        boolean success = appointmentHandler.cancelAppointment(appointmentId);
//
//        if (success) {
//            System.out.println("Appointment #" + appointmentId + " cancelled successfully.");
//        } else {
//            System.out.println("Failed to cancel appointment. Please check the appointment ID.");
//        }
//    }
//
//    public void viewMyVitalSigns() {
//        filehandling.VitalSignHandler vitalHandler = new filehandling.VitalSignHandler();
//        List<things.VitalSign> myVitals = vitalHandler.getPatientVitalSigns(this.patientId);
//
//        if (myVitals.isEmpty()) {
//            System.out.println("You have no vital sign records.");
//            return;
//        }
//
//        System.out.println("Your Vital Sign Records:\n");
//        for (things.VitalSign vital : myVitals) {
//            System.out.println("-".repeat(40));
//            System.out.println("Date: " + vital.getFormattedDateTime());
//            System.out.println("Recorded by Doctor: " + vital.getDoctorId());
//            System.out.println("Heart Rate: " + vital.getHeartRate() + " bpm");
//            System.out.println("Blood Pressure: " + vital.getUpperBloodPressure() + "/" +
//                              vital.getLowerBloodPressure() + " mmHg");
//            System.out.println("Oxygen Saturation: " + vital.getOxygenLevel() + "%");
//            System.out.println("Temperature: " + String.format("%.1f", vital.getTemperature()) + "°C");
//
//            if (vital.getNotes() != null && !vital.getNotes().isEmpty()) {
//                System.out.println("Notes: " + vital.getNotes());
//            }
//        }
//    }
//
//    public void getLatestVitalSigns() {
//        filehandling.VitalSignHandler vitalHandler = new filehandling.VitalSignHandler();
//        List<things.VitalSign> myVitals = vitalHandler.getPatientVitalSigns(this.patientId);
//
//        if (myVitals.isEmpty()) {
//            System.out.println("You have no vital sign records.");
//            return;
//        }
//
//        // Find the most recent vital signs
//        things.VitalSign latest = myVitals.get(0);
//        for (things.VitalSign vital : myVitals) {
//            if (vital.getRecordDate().isAfter(latest.getRecordDate())) {
//                latest = vital;
//            }
//        }
//
//        System.out.println("Your Latest Vital Signs (Recorded on " + latest.getFormattedDateTime() + "):");
//        System.out.println("-".repeat(40));
//        System.out.println("Heart Rate: " + latest.getHeartRate() + " bpm");
//        System.out.println("Blood Pressure: " + latest.getUpperBloodPressure() + "/" +
//                          latest.getLowerBloodPressure() + " mmHg");
//        System.out.println("Oxygen Saturation: " + latest.getOxygenLevel() + "%");
//        System.out.println("Temperature: " + String.format("%.1f", latest.getTemperature()) + "°C");
//
//        if (latest.getNotes() != null && !latest.getNotes().isEmpty()) {
//            System.out.println("Doctor's Notes: " + latest.getNotes());
//        }
//    }
}
