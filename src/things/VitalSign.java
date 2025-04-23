package things;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VitalSign {
    private int vitalId;
    private String patientId;
    private String doctorId;
    private int heartRate;
    private int oxygenLevel;
    private int upperBloodPressure;
    private int lowerBloodPressure;
    private double temperature;
    private LocalDateTime recordDate;
    private String notes;
        
    // Normal ranges for vital signs
    private static final int NORMAL_HEART_RATE_MIN = 60;
    private static final int NORMAL_HEART_RATE_MAX = 100;
    private static final int NORMAL_OXYGEN_MIN = 95;
    private static final int NORMAL_OXYGEN_MAX = 100;
    private static final int NORMAL_BP_UPPER_MIN = 90;
    private static final int NORMAL_BP_UPPER_MAX = 120;
    private static final int NORMAL_BP_LOWER_MIN = 60;
    private static final int NORMAL_BP_LOWER_MAX = 80;
    private static final double NORMAL_TEMP_MIN = 36.1;
    private static final double NORMAL_TEMP_MAX = 37.2;

    public VitalSign(int vitalId, String patientId, String doctorId, int heartRate, int oxygenLevel,         
                    int upperBloodPressure, int lowerBloodPressure, double temperature, 
                    LocalDateTime recordDate, String notes) {
        this.vitalId = vitalId;        this.patientId = patientId;
        this.doctorId = doctorId;
        this.heartRate = heartRate;
        this.oxygenLevel = oxygenLevel;
        this.upperBloodPressure = upperBloodPressure;
        this.lowerBloodPressure = lowerBloodPressure;
        this.temperature = temperature;
        this.recordDate = recordDate;
        this.notes = notes;
    }
    
    // Getters and setters
    public int getVitalId() { return vitalId; }
    
    public String getPatientId() { return patientId; }
    
    public String getDoctorId() { return doctorId; }
    
    public int getHeartRate() { return heartRate; }
    public void setHeartRate(int heartRate) { this.heartRate = heartRate; }
    
    public int getOxygenLevel() { return oxygenLevel; }
    public void setOxygenLevel(int oxygenLevel) { this.oxygenLevel = oxygenLevel; }
    
    public int getUpperBloodPressure() { return upperBloodPressure; }
    public void setUpperBloodPressure(int upperBloodPressure) { this.upperBloodPressure = upperBloodPressure; }
    
    public int getLowerBloodPressure() { return lowerBloodPressure; }
    public void setLowerBloodPressure(int lowerBloodPressure) { this.lowerBloodPressure = lowerBloodPressure; }
    
    public double getTemperature() { return temperature; }
    public void setTemperature(double temperature) { this.temperature = temperature; }
    
    public LocalDateTime getRecordDate() { return recordDate; }
    
    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
    
    public String getFormattedDateTime() {
        return recordDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }
    
    public boolean isHeartRateAbnormal() {
        return heartRate < NORMAL_HEART_RATE_MIN || heartRate > NORMAL_HEART_RATE_MAX;
    }

    public boolean isOxygenLevelAbnormal() {
        return oxygenLevel < NORMAL_OXYGEN_MIN || oxygenLevel > NORMAL_OXYGEN_MAX;
    }

    public boolean isBloodPressureAbnormal() {
        return upperBloodPressure < NORMAL_BP_UPPER_MIN || upperBloodPressure > NORMAL_BP_UPPER_MAX ||
               lowerBloodPressure < NORMAL_BP_LOWER_MIN || lowerBloodPressure > NORMAL_BP_LOWER_MAX;
    }

    public boolean isTemperatureAbnormal() {
        return temperature < NORMAL_TEMP_MIN || temperature > NORMAL_TEMP_MAX;
    }

    public boolean areVitalsAbnormal() {
        return isHeartRateAbnormal() || isOxygenLevelAbnormal() || 
               isBloodPressureAbnormal() || isTemperatureAbnormal();
    }

    @Override
    public String toString() {
        return "Vital Signs [" + getFormattedDateTime() + "]" +
               "\nHeart Rate: " + heartRate + " bpm" +
               "\nBlood Pressure: " + upperBloodPressure + "/" + lowerBloodPressure + " mmHg" +
               "\nOxygen Level: " + oxygenLevel + "%" +
               "\nTemperature: " + String.format("%.1f", temperature) + "°C" +
               (notes != null && !notes.isEmpty() ? "\nNotes: " + notes : "");
    }
}
