package student_27980.q6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("27980 - === BANKING SYSTEM ===");
            
            System.out.print("27980 - Enter Customer Name: ");
            String customerName = scanner.nextLine();
            
            System.out.print("27980 - Enter Phone Number: ");
            String phoneNumber = scanner.nextLine();
            
            System.out.print("27980 - Enter Account Number: ");
            String accountNumber = scanner.nextLine();
            
            System.out.print("27980 - Enter Account Type: ");
            String accountType = scanner.nextLine();

            System.out.print("27980 - Enter Account Balance: $");
            double balance = scanner.nextDouble();
            
            System.out.print("27980 - Enter Transaction Amount: $");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("27980 - Enter Transaction Type: ");
            String transactionType = scanner.nextLine();
            
            System.out.print("27980 - Enter Deposit Amount: $");
            double depositAmount = scanner.nextDouble();
            
            System.out.print("27980 - Enter Withdrawal Amount: $");
            double withdrawalAmount = scanner.nextDouble();
            
            System.out.print("27980 - Enter Loan Amount: $");
            double loanAmount = scanner.nextDouble();
            
            System.out.print("27980 - Enter Interest Rate: ");
            double interestRate = scanner.nextDouble();
            
            System.out.print("27980 - Enter Duration (months): ");
            int duration = scanner.nextInt();
            
            System.out.print("27980 - Enter Payment Amount: $");
            double paymentAmount = scanner.nextDouble();
            
            AccountRecord account = new AccountRecord(
                1, "National Bank", "MAIN",
                accountNumber, accountType, balance, customerName, phoneNumber,
                transactionType, amount, depositAmount, withdrawalAmount,
                loanAmount, interestRate, duration, paymentAmount
            );
            
            System.out.println("\n27980 - === ACCOUNT RECORD GENERATED ===");
            account.displayAccountRecord();
            
        } catch (BankingDataException e) {
            System.out.println("27980 - Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("27980 - Invalid input");
        } finally {
            scanner.close();
        }
    }
}