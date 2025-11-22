package student_27980.q2;

public class School extends Entity {
    private String schoolName;
    private String phoneNumber;
    
    public School(int id, String schoolName, String phoneNumber) throws SchoolDataException {
        super(id);
        if (!phoneNumber.matches("\\d{10}")) {
            throw new SchoolDataException("27980 - Phone must be 10 digits");
        }
        this.schoolName = schoolName;
        this.phoneNumber = phoneNumber;
    }
    
    public String getSchoolName() { return schoolName; }
    public String getPhoneNumber() { return phoneNumber; }
}