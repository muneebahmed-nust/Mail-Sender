package things;
import java.time.LocalDateTime;

public class Appointment {
    private int appointmentId;
    private String doctorId;
    private String patientId;
    private LocalDateTime appointmentDateTime;
    private String status; // "SCHEDULED", "COMPLETED", "CANCELLED"
    private String reason;
    
    public Appointment(int appointmentId, String doctorId, String patientId, 
                      LocalDateTime appointmentDateTime, String reason) {
        this.appointmentId = appointmentId;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.appointmentDateTime = appointmentDateTime;
        this.status = "SCHEDULED";
        this.reason = reason;
    }
    
    // Getters and Setters
    public int getAppointmentId() { return appointmentId; }
    
    public String getDoctorId() { return doctorId; }
    
    public String getPatientId() { return patientId; }
    
    public LocalDateTime getAppointmentDateTime() { return appointmentDateTime; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }
    
    // Format appointment date/time as string
    public String getFormattedDateTime() {
        return appointmentDateTime.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }
    
    @Override
    public String toString() {
        return "Appointment #" + appointmentId + 
               "\nDoctor: " + doctorId + 
               "\nPatient: " + patientId + 
               "\nDate/Time: " + getFormattedDateTime() + 
               "\nStatus: " + status +
               "\nReason: " + reason;
    }
}
