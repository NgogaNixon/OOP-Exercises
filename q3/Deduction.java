package student_27980.q3;

public class Deduction extends Allowance {
    private double taxDeduction;
    private double loanDeduction;
    
    public Deduction(int id, String companyName, String phoneNumber, String departmentName,
                     String departmentCode, String managerName,
                     String employeeName, int employeeId, String designation,
                     int totalDays, int presentDays, int leaveDays,
                     double housingAllowance, double transportAllowance,
                     double taxDeduction, double loanDeduction) throws PayrollDataException {
        super(id, companyName, phoneNumber, departmentName, departmentCode, managerName, employeeName, employeeId, designation, totalDays, presentDays, leaveDays, housingAllowance, transportAllowance);
        if (taxDeduction < 0 || loanDeduction < 0) {
            throw new PayrollDataException("27980 - Deductions cannot be negative");
        }
        this.taxDeduction = taxDeduction;
        this.loanDeduction = loanDeduction;
    }
    
    public double getTaxDeduction() { return taxDeduction; }
    public double getLoanDeduction() { return loanDeduction; }
    public double getTotalDeductions() { return taxDeduction + loanDeduction; }
}