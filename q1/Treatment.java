package student_27980.q1;

public class Treatment extends Admission {
    private String diagnosis;
    private double treatmentCost;
    
    public Treatment(int id, String hospitalName, String phoneNumber, String departmentName,
                     String departmentCode, String doctorName, String specialization,
                     String nurseName, String shift, String patientName, int age, String gender,
                     int roomNumber, double roomCharges, String diagnosis, double treatmentCost) throws HospitalDataException {
        super(id, hospitalName, phoneNumber, departmentName, departmentCode, doctorName, specialization, nurseName, shift, patientName, age, gender, roomNumber, roomCharges);
        if (treatmentCost <= 0) {
            throw new HospitalDataException("27980 - Treatment cost must be greater than 0");
        }
        this.diagnosis = diagnosis;
        this.treatmentCost = treatmentCost;
    }
    
    public String getDiagnosis() { return diagnosis; }
    public double getTreatmentCost() { return treatmentCost; }
}