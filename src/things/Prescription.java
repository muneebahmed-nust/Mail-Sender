package things;

import java.util.ArrayList;


public class Prescription {
    ArrayList<Medication> medications;
    
    
    public Prescription() {
        this.medications = new ArrayList<>();
    }

    public void addMedication(Medication medication) {
        this.medications.add(medication);
    }

    public ArrayList<Medication> getMedications() {
        return medications;
    }

    public void setMedications(ArrayList<Medication> medications) {
        this.medications = medications;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Prescription:\n");
        for (Medication medication : medications) {
            sb.append(medication.toString()).append("\n");
        }
        return sb.toString();
    }


}
