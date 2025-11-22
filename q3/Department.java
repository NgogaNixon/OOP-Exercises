package student_27980.q3;

public class Department extends Company {
    private String departmentName;
    private String departmentCode;
    
    public Department(int id, String companyName, String phoneNumber, 
                     String departmentName, String departmentCode) throws PayrollDataException {
        super(id, companyName, phoneNumber);
        if (departmentCode.length() < 3) {
            throw new PayrollDataException("27980 - Department code must be at least 3 characters");
        }
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
    
    public String getDepartmentName() { return departmentName; }
    public String getDepartmentCode() { return departmentCode; }
}