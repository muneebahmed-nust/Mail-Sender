package things;



public class Feedback {
    int feedbackID;
    String Remarks;
    int PatientID;
    int doctorID;
    String dateAndTime;
    Prescription prescription;


    public Feedback(int feedbackID,String remarks, int patientID, int doctorID, String dateAndTime, Prescription prescription) {
        this.Remarks = remarks;
        this.PatientID = patientID;
        this.doctorID = doctorID;
        this.dateAndTime = dateAndTime;
        this.prescription = prescription;
    }

    public int getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(int feedbackID) {
        this.feedbackID = feedbackID;
    }
    
    public String getRemarks() {
        return Remarks;
    }


    public void setRemarks(String remarks) {
        Remarks = remarks;
    }


    public int getPatientID() {
        return PatientID;
    }


    public void setPatientID(int patientID) {
        PatientID = patientID;
    }


    public int getDoctorID() {
        return doctorID;
    }


    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }


    public String getDateAndTime() {
        return dateAndTime;
    }


    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }


    public Prescription getPrescription() {
        return prescription;
    }


    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }


    
     
}
