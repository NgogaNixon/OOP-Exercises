package student_27980.q1;

public final class Bill extends Treatment {
    private double doctorFee;
    private double medicineCost;
    
    public Bill(int id, String hospitalName, String phoneNumber, String departmentName,
                String departmentCode, String doctorName, String specialization,
                String nurseName, String shift, String patientName, int age, String gender,
                int roomNumber, double roomCharges, String diagnosis, double treatmentCost,
                double doctorFee, double medicineCost) throws HospitalDataException {
        super(id, hospitalName, phoneNumber, departmentName, departmentCode, doctorName, specialization, nurseName, shift, patientName, age, gender, roomNumber, roomCharges, diagnosis, treatmentCost);
        if (doctorFee <= 0 || medicineCost <= 0) {
            throw new HospitalDataException("27980 - Doctor fee and medicine cost must be greater than 0");
        }
        this.doctorFee = doctorFee;
        this.medicineCost = medicineCost;
    }
    
    public double generateBill() {
        return getRoomCharges() + getTreatmentCost() + doctorFee + medicineCost;
    }
    
    public void displayBill() {
        System.out.println("27980 - === HOSPITAL BILL ===");
        System.out.println("27980 - Patient: " + getPatientName());
        System.out.println("27980 - Hospital: " + getHospitalName());
        System.out.println("27980 - Doctor: " + getDoctorName());
        System.out.println("27980 - Diagnosis: " + getDiagnosis());
        System.out.println("27980 - Room Charges: $" + getRoomCharges());
        System.out.println("27980 - Treatment Cost: $" + getTreatmentCost());
        System.out.println("27980 - Doctor Fee: $" + doctorFee);
        System.out.println("27980 - Medicine Cost: $" + medicineCost);
        System.out.println("27980 - TOTAL: $" + generateBill());
    }
}