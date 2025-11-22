package student_27980.q1;

public class Hospital extends Entity {
    private String hospitalName;
    private String phoneNumber;
    
    public Hospital(int id, String hospitalName, String phoneNumber) throws HospitalDataException {
        super(id);
        if (!phoneNumber.matches("\\d{10}")) {
            throw new HospitalDataException("27980 - Phone must be 10 digits");
        }
        this.hospitalName = hospitalName;
        this.phoneNumber = phoneNumber;
    }
    
    public String getHospitalName() { return hospitalName; }
    public String getPhoneNumber() { return phoneNumber; }
}