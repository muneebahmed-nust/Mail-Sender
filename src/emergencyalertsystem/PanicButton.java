package emergencyalertsystem;


public class PanicButton {

    final private EmergencyAlert emergencyAlert;

    public PanicButton(EmergencyAlert emergencyAlert) {
        this.emergencyAlert = emergencyAlert;
    }

    public void manualtriggerEmergencyAlert() {
        emergencyAlert.triggerEmergency();
    }

    
    

    

}
