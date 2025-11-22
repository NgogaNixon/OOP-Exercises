package student_27980.q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("27980 - === EMPLOYEE PAYROLL SYSTEM ===");
            
            System.out.print("27980 - Enter Employee Name: ");
            String employeeName = scanner.nextLine();
            
            System.out.print("27980 - Enter Employee ID: ");
            int employeeId = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("27980 - Enter Designation: ");
            String designation = scanner.nextLine();
            
            System.out.print("27980 - Enter Total Working Days: ");
            int totalDays = scanner.nextInt();
            
            System.out.print("27980 - Enter Present Days: ");
            int presentDays = scanner.nextInt();
            
            System.out.print("27980 - Enter Basic Salary: $");
            double basicSalary = scanner.nextDouble();
            
            System.out.print("27980 - Enter Housing Allowance: $");
            double housingAllowance = scanner.nextDouble();
            
            System.out.print("27980 - Enter Transport Allowance: $");
            double transportAllowance = scanner.nextDouble();
            
            System.out.print("27980 - Enter Tax Deduction: $");
            double taxDeduction = scanner.nextDouble();
            
            System.out.print("27980 - Enter Loan Deduction: $");
            double loanDeduction = scanner.nextDouble();
        
            PayrollRecord payroll = new PayrollRecord(
                1, "Tech Solutions Ltd", "1234567890", "IT", "ITD",
                "Sarah Wilson", employeeName, employeeId, designation,
                totalDays, presentDays, 0, housingAllowance, transportAllowance,
                taxDeduction, loanDeduction, basicSalary
            );
            
            System.out.println("\n27980 - === PAYROLL GENERATED ===");
            payroll.displayPayroll();
            
        } catch (PayrollDataException e) {
            System.out.println("27980 - Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("27980 - Invalid input");
        } finally {
            scanner.close();
        }
    }
}
