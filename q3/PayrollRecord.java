package student_27980.q3;

public final class PayrollRecord extends Salary {
    public PayrollRecord(int id, String companyName, String phoneNumber, String departmentName,
                        String departmentCode, String managerName,
                        String employeeName, int employeeId, String designation,
                        int totalDays, int presentDays, int leaveDays,
                        double housingAllowance, double transportAllowance,
                        double taxDeduction, double loanDeduction, double basicSalary) throws PayrollDataException {
        super(id, companyName, phoneNumber, departmentName, departmentCode, managerName, employeeName, employeeId, designation, totalDays, presentDays, leaveDays, housingAllowance, transportAllowance, taxDeduction, loanDeduction, basicSalary);
    }
    
    public void displayPayroll() {
        System.out.println("27980 - === EMPLOYEE PAYROLL ===");
        System.out.println("27980 - Employee: " + getEmployeeName() + " (ID: " + getEmployeeId() + ")");
        System.out.println("27980 - Company: " + getCompanyName() + " | Designation: " + getDesignation());
        System.out.println("27980 - Department: " + getDepartmentName() + " | Manager: " + getManagerName());
        System.out.println("27980 - Attendance: " + getPresentDays() + "/" + getTotalDays() + " days");
        System.out.println("27980 - Basic Salary: $" + getBasicSalary());
        System.out.println("27980 - Housing Allowance: $" + getHousingAllowance());
        System.out.println("27980 - Transport Allowance: $" + getTransportAllowance());
        System.out.println("27980 - Tax Deduction: $" + getTaxDeduction());
        System.out.println("27980 - Loan Deduction: $" + getLoanDeduction());
        System.out.println("27980 - Gross Salary: $" + getGrossSalary());
        System.out.println("27980 - NET SALARY: $" + calculateNetSalary());
        System.out.println("27980 - =========================");
    }
}