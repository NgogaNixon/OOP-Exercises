package student_27980.q1;

public class Nurse extends Doctor {
    private String nurseName;
    private String shift;
    
    public Nurse(int id, String hospitalName, String phoneNumber, String departmentName,
                 String departmentCode, String doctorName, String specialization,
                 String nurseName, String shift) throws HospitalDataException {
        super(id, hospitalName, phoneNumber, departmentName, departmentCode, doctorName, specialization);
        if (!shift.equals("Day") && !shift.equals("Night")) {
            throw new HospitalDataException("27980 - Shift must be Day or Night");
        }
        this.nurseName = nurseName;
        this.shift = shift;
    }
    
    public String getNurseName() { return nurseName; }
    public String getShift() { return shift; }
}