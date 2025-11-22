package student_27980.q3;

public class Attendance extends Employee {
    private int totalDays;
    private int presentDays;
    private int leaveDays;
    
    public Attendance(int id, String companyName, String phoneNumber, String departmentName,
                      String departmentCode, String managerName,
                      String employeeName, int employeeId, String designation,
                      int totalDays, int presentDays, int leaveDays) throws PayrollDataException {
        super(id, companyName, phoneNumber, departmentName, departmentCode, managerName, employeeName, employeeId, designation);
        if (totalDays < 0 || presentDays < 0 || leaveDays < 0) {
            throw new PayrollDataException("27980 - Days cannot be negative");
        }
        if (presentDays > totalDays) {
            throw new PayrollDataException("27980 - Present days cannot exceed total days");
        }
        this.totalDays = totalDays;
        this.presentDays = presentDays;
        this.leaveDays = leaveDays;
    }
    
    public int getTotalDays() { return totalDays; }
    public int getPresentDays() { return presentDays; }
    public int getLeaveDays() { return leaveDays; }
}