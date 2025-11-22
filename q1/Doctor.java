package student_27980.q1;

public class Doctor extends Department {
    private String doctorName;
    private String specialization;
    
    public Doctor(int id, String hospitalName, String phoneNumber, String departmentName,
                 String departmentCode, String doctorName, String specialization) throws HospitalDataException {
        super(id, hospitalName, phoneNumber, departmentName, departmentCode);
        if (specialization.isEmpty()) {
            throw new HospitalDataException("27980 - Specialization cannot be empty");
        }
        this.doctorName = doctorName;
        this.specialization = specialization;
    }
    
    public String getDoctorName() { return doctorName; }
    public String getSpecialization() { return specialization; }
}