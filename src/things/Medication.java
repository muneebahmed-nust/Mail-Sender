package things;

public class Medication {
    private String name;
    private String dosage;
    private String schedule;

    public Medication(String name, String dosage, String schedule) {
        this.name = name;
        this.dosage = dosage;
        this.schedule = schedule;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getDosage() { return dosage; }
    public void setDosage(String dosage) { this.dosage = dosage; }
    
    public String getSchedule() { return schedule; }
    public void setSchedule(String schedule) { this.schedule = schedule; }
    
    @Override
    public String toString() {
        return "Medication: " + name + ", Dosage: " + dosage + ", Schedule: " + schedule;
    }
}