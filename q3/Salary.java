package student_27980.q3;

public class Salary extends Deduction {
    private double basicSalary;
    
    public Salary(int id, String companyName, String phoneNumber, String departmentName,
                  String departmentCode, String managerName,
                  String employeeName, int employeeId, String designation,
                  int totalDays, int presentDays, int leaveDays,
                  double housingAllowance, double transportAllowance,
                  double taxDeduction, double loanDeduction, double basicSalary) throws PayrollDataException {
        super(id, companyName, phoneNumber, departmentName, departmentCode, managerName, employeeName, employeeId, designation, totalDays, presentDays, leaveDays, housingAllowance, transportAllowance, taxDeduction, loanDeduction);
        if (basicSalary <= 0) throw new PayrollDataException("27980 - Basic salary must be greater than 0");
        this.basicSalary = basicSalary;
    }
    
    public double getBasicSalary() { return basicSalary; }
    public double getGrossSalary() { return basicSalary + getTotalAllowances(); }
    public double calculateNetSalary() { return getGrossSalary() - getTotalDeductions(); }
}