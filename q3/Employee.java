package student_27980.q3;

public class Employee extends Manager {
    private String employeeName;
    private int employeeId;
    private String designation;
    
    public Employee(int id, String companyName, String phoneNumber, String departmentName,
                    String departmentCode, String managerName,
                    String employeeName, int employeeId, String designation) throws PayrollDataException {
        super(id, companyName, phoneNumber, departmentName, departmentCode, managerName);
        if (employeeId <= 0) throw new PayrollDataException("27980 - Employee ID must be greater than 0");
        if (designation.isEmpty()) throw new PayrollDataException("27980 - Designation cannot be empty");
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.designation = designation;
    }
    
    public String getEmployeeName() { return employeeName; }
    public int getEmployeeId() { return employeeId; }
    public String getDesignation() { return designation; }
}