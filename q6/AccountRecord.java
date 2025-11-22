package student_27980.q6;

public final class AccountRecord extends Payment {
    public AccountRecord(int id, String bankName, String branchCode,
                        String accountNumber, String accountType, double balance,
                        String customerName, String phoneNumber,
                        String transactionType, double amount,
                        double depositAmount, double withdrawalAmount,
                        double loanAmount, double interestRate, int duration,
                        double paymentAmount) throws BankingDataException {
        super(id, bankName, branchCode, accountNumber, accountType, balance, customerName, phoneNumber, transactionType, amount, depositAmount, withdrawalAmount, loanAmount, interestRate, duration, paymentAmount);
    }
    
    public void displayAccountRecord() {
        System.out.println("27980 - === BANK ACCOUNT RECORD ===");
        System.out.println("27980 - Bank: " + getBankName() + " | Branch: " + getBranchCode());
        System.out.println("27980 - Customer: " + getCustomerName() + " | Phone: " + getPhoneNumber());
        System.out.println("27980 - Account: " + getAccountNumber() + " (" + getAccountType() + ")");
        System.out.println("27980 - Balance: $" + getBalance());
        System.out.println("27980 - Transaction: " + getTransactionType() + " - $" + getAmount());
        System.out.println("27980 - Deposit: $" + getDepositAmount());
        System.out.println("27980 - Withdrawal: $" + getWithdrawalAmount());
        System.out.println("27980 - Loan: $" + getLoanAmount());
        System.out.println("27980 - Interest Rate: " + getInterestRate() + "% | Duration: " + getDuration() + " months");
        System.out.println("27980 - Calculated Interest: $" + calculateInterest());
        System.out.println("27980 - Payment: $" + getPaymentAmount());
        System.out.println("27980 - ============================");
    }
}