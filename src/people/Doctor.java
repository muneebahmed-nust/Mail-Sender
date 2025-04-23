package people;

import java.util.List;

public class Doctor extends User {
     String doctorId;
     String specialization;

    public Doctor(String name, String phoneNumber, String email, String password, String dateOfBirth, String cnic, Gender gender, String doctorId, String specialization) {
        super(name, phoneNumber, email, password, dateOfBirth, cnic, gender);
        this.doctorId = doctorId;
        this.specialization = specialization;
    }
    
    public String getDoctorId() {
        return doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    
    public void giveFeedback(int patientID, String remarks, things.Prescription prescription) {
        // Get current date and time as string
        java.time.LocalDateTime currentTime = java.time.LocalDateTime.now();
        String dateAndTime = currentTime.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        
        // Generate a unique feedback ID (current timestamp in milliseconds)
        int feedbackID = (int)(System.currentTimeMillis() % Integer.MAX_VALUE);
        
        // Parse doctor ID to integer (assuming doctorId is a string like "D001")
        int doctorIDInt;
        try {
            doctorIDInt = Integer.parseInt(doctorId.substring(1));
        } catch (NumberFormatException e) {
            doctorIDInt = 0; // Default value if parsing fails
        }
        
        // Create a new feedback object
        things.Feedback feedback = new things.Feedback(
            feedbackID,
            remarks,
            patientID,
            doctorIDInt,
            dateAndTime,
            prescription
        );
        
//        // Use the FeedbackHandler to save the feedback
//        filehandling.FeedbackHandler handler = new filehandling.FeedbackHandler();
//        handler.addFeedback(feedback);
//
//        System.out.println("Feedback created successfully with ID: " + feedbackID);
//    }
//
//    public void uploadRecords(){}
//
//    public void handleAppointments(){
//
//    }
//
//    public void viewMySchedule() {
//        filehandling.AppointmentHandler appointmentHandler = new filehandling.AppointmentHandler();
//        List<things.Appointment> myAppointments = appointmentHandler.getDoctorAppointments(this.doctorId);
//
//        if (myAppointments.isEmpty()) {
//            System.out.println("You have no scheduled appointments.");
//        } else {
//            System.out.println("Your appointment schedule:");
//            for (things.Appointment appointment : myAppointments) {
//                if (appointment.getStatus().equals("SCHEDULED")) {
//                    System.out.println("----------------------------");
//                    System.out.println(appointment);
//                }
//            }
//        }
//    }
//
//    public void completeAppointment(int appointmentId) {
//        filehandling.AppointmentHandler appointmentHandler = new filehandling.AppointmentHandler();
//        boolean success = appointmentHandler.completeAppointment(appointmentId);
//
//        if (success) {
//            System.out.println("Appointment #" + appointmentId + " marked as completed.");
//        } else {
//            System.out.println("Failed to update appointment. Please check the appointment ID.");
//        }
//    }
//
//    public void recordPatientVitals(String patientId, int heartRate, int oxygenLevel,
//                                   int upperBloodPressure, int lowerBloodPressure,
//                                   double temperature, String notes) {
//        // Create handler
//        filehandling.VitalSignHandler vitalHandler = new filehandling.VitalSignHandler();
//
//        // Generate a new vital sign ID
//        int vitalId = vitalHandler.generateVitalId();
//
//        // Create vital sign with current date/time
//        things.VitalSign vitalSign = new things.VitalSign(
//            vitalId,
//            patientId,
//            this.doctorId,
//            heartRate,
//            oxygenLevel,
//            upperBloodPressure,
//            lowerBloodPressure,
//            temperature,
//            java.time.LocalDateTime.now(),
//            notes
//        );
//
//        // Save the vital sign
//        vitalHandler.addVitalSigns(vitalSign);
//
//        System.out.println("Vital signs recorded successfully for patient " + patientId);
//    }
//
//    public void viewPatientVitals(String patientId) {
//        filehandling.VitalSignHandler vitalHandler = new filehandling.VitalSignHandler();
//        List<things.VitalSign> patientVitals = vitalHandler.getPatientVitalSigns(patientId);
//
//        if (patientVitals.isEmpty()) {
//            System.out.println("No vital records found for patient " + patientId);
//            return;
//        }
//
//        System.out.println("Vital Records for Patient " + patientId + ":\n");
//        for (things.VitalSign vital : patientVitals) {
//            System.out.println("-".repeat(40));
//            System.out.println(vital);
//        }
//    }
//
//    public void viewMyRecordedVitals() {
//        filehandling.VitalSignHandler vitalHandler = new filehandling.VitalSignHandler();
//        List<things.VitalSign> myRecords = vitalHandler.getDoctorRecordedVitalSigns(this.doctorId);
//
//        if (myRecords.isEmpty()) {
//            System.out.println("You haven't recorded any vital signs yet.");
//            return;
//        }
//
//        System.out.println("Vital Records You've Recorded:\n");
//        for (things.VitalSign vital : myRecords) {
//            System.out.println("-".repeat(40));
//            System.out.println("Patient: " + vital.getPatientId());
//            System.out.println(vital);
//        }
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Smith", "03345637890", "dr.smith@hospital.com", 
                                  "password", "1975-10-15", "1234567890123", 
                                  Gender.MALE, "D001", "Cardiology");
        doctor.giveFeedback(1, "Great service!", null);
    }
}
