package student_27980.q3;

public class Manager extends Department {
    private String managerName;
    
    public Manager(int id, String companyName, String phoneNumber, String departmentName,
                   String departmentCode, String managerName) throws PayrollDataException {
        super(id, companyName, phoneNumber, departmentName, departmentCode);
        if (managerName.isEmpty()) {
            throw new PayrollDataException("27980 - Manager name cannot be empty");
        }
        this.managerName = managerName;
    }
    
    public String getManagerName() { return managerName; }
}