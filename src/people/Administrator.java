package people;


import java.util.List;

public class Administrator extends User {
    String adminId;

    public Administrator(String name, String phoneNumber, String email, String password, String dateOfBirth, String cnic, Gender gender, String adminId) {
        super(name, phoneNumber, email, password, dateOfBirth, cnic, gender);
        this.adminId = adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminId() {
        return adminId;
    }
    
//    // Method to add a patient
//    public void addPatient(String name, String phoneNumber, String email, String password,
//                          String dateOfBirth, String cnic, Gender gender, String patientId) {
//        // Create new Patient object
//        Patient newPatient = new Patient(name, phoneNumber, email, password,
//                                        dateOfBirth, cnic, gender, patientId);
//
//        // Add to system via UserHandler
//        UserHandler.addPatient(newPatient);
//
//        System.out.println("Patient " + name + " (ID: " + patientId + ") added successfully by admin " + this.adminId);
//    }
//
//    // Method to add a doctor
//    public void addDoctor(String name, String phoneNumber, String email, String password,
//                         String dateOfBirth, String cnic, Gender gender, String doctorId, String specialization) {
//        // Create new Doctor object
//        Doctor newDoctor = new Doctor(name, phoneNumber, email, password,
//                                     dateOfBirth, cnic, gender, doctorId, specialization);
//
//        // Add to system via UserHandler
//        UserHandler.addDoctor(newDoctor);
//
//        System.out.println("Doctor " + name + " (ID: " + doctorId + ") added successfully by admin " + this.adminId);
//    }
    
//    // Method to view all patients
//    public void viewAllPatients() {
//        List<String[]> patients = UserHandler.getAllPatients();
//        UserHandler.displayPatientsList(patients);
//    }
//
//    // Method to view all doctors
//    public void viewAllDoctors() {
//        List<String[]> doctors = UserHandler.getAllDoctors();
//        UserHandler.displayDoctorsList(doctors);
//    }
//
//    // Method to remove a patient
//    public void removePatient(String patientId) {
//        boolean success = UserHandler.removePatient(patientId);
//
//        if (success) {
//            System.out.println("Patient with ID " + patientId + " removed successfully.");
//        } else {
//            System.out.println("Failed to remove patient. ID " + patientId + " not found.");
//        }
//    }
//
//    // Method to remove a doctor
//    public void removeDoctor(String doctorId) {
//        boolean success = UserHandler.removeDoctor(doctorId);
//
//        if (success) {
//            System.out.println("Doctor with ID " + doctorId + " removed successfully.");
//        } else {
//            System.out.println("Failed to remove doctor. ID " + doctorId + " not found.");
//        }

}
