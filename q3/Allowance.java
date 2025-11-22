package student_27980.q3;

public class Allowance extends Attendance {
    private double housingAllowance;
    private double transportAllowance;
    
    public Allowance(int id, String companyName, String phoneNumber, String departmentName,
                     String departmentCode, String managerName,
                     String employeeName, int employeeId, String designation,
                     int totalDays, int presentDays, int leaveDays,
                     double housingAllowance, double transportAllowance) throws PayrollDataException {
        super(id, companyName, phoneNumber, departmentName, departmentCode, managerName, employeeName, employeeId, designation, totalDays, presentDays, leaveDays);
        if (housingAllowance < 0 || transportAllowance < 0) {
            throw new PayrollDataException("27980 - Allowances cannot be negative");
        }
        this.housingAllowance = housingAllowance;
        this.transportAllowance = transportAllowance;
    }
    
    public double getHousingAllowance() { return housingAllowance; }
    public double getTransportAllowance() { return transportAllowance; }
    public double getTotalAllowances() { return housingAllowance + transportAllowance; }
}