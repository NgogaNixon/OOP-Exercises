package student_27980.q2;

public class Department extends School {
    private String departmentName;
    private String departmentCode;
    
    public Department(int id, String schoolName, String phoneNumber, 
                     String departmentName, String departmentCode) throws SchoolDataException {
        super(id, schoolName, phoneNumber);
        if (departmentCode.length() < 3) {
            throw new SchoolDataException("27980 - Department code must be at least 3 characters");
        }
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
    
    public String getDepartmentName() { return departmentName; }
    public String getDepartmentCode() { return departmentCode; }
}