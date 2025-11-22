package student_27980.q1;

public class Department extends Hospital {
    private String departmentName;
    private String departmentCode;
    
    public Department(int id, String hospitalName, String phoneNumber, 
                     String departmentName, String departmentCode) throws HospitalDataException {
        super(id, hospitalName, phoneNumber);
        if (departmentCode.length() < 3) {
            throw new HospitalDataException("27980 - Department code must be at least 3 characters");
        }
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
    
    public String getDepartmentName() { return departmentName; }
    public String getDepartmentCode() { return departmentCode; }
}