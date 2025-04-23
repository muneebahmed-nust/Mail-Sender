package emergencyalertsystem;

import java.time.LocalDateTime;
import things.VitalSign;
import people.*;


public class EmergencyAlert {

    private VitalSign vitals ;

    public EmergencyAlert(VitalSign vitals){
    this.vitals =vitals;

    }

    public void checkVitals() {
        if (vitals.areVitalsAbnormal()) {
            triggerEmergency();
        }
    }

    public void triggerEmergency() {
        
            System.out.println("EMERGENCY ALERT!");
            System.out.println("Patient ID: " + vitals.getPatientId());
            System.out.println("Abnormal Vital Signs:");
            
            if (vitals.isHeartRateAbnormal()) {
                System.out.println("- Heart Rate: " + vitals.getHeartRate() + " bpm");
            }
            if (vitals.isOxygenLevelAbnormal()) {
                System.out.println("- Oxygen Level: " + vitals.getOxygenLevel() + "%");
            }
            if (vitals.isBloodPressureAbnormal()) {
                System.out.println("- Blood Pressure: " + vitals.getUpperBloodPressure() + 
                                  "/" + vitals.getLowerBloodPressure() + " mmHg");
            }
            if (vitals.isTemperatureAbnormal()) {
                System.out.println("- Temperature: " + vitals.getTemperature() + "°C");
            }
          //  EmailNotification.sendNotifications("muneebahmed115@outlook.com","Emergency Alert","Patient ID: " + vitals.getPatientId() + " has abnormal vitals");
            // Here you could add additional emergency response actions
            // like notifying doctors, sending alerts, etc.
    
    }

 
    public static void main(String[] args) {

    }
}
