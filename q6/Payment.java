package student_27980.q6;

public class Payment extends Loan {
    private double paymentAmount;
    
    public Payment(int id, String bankName, String branchCode,
                   String accountNumber, String accountType, double balance,
                   String customerName, String phoneNumber,
                   String transactionType, double amount,
                   double depositAmount, double withdrawalAmount,
                   double loanAmount, double interestRate, int duration,
                   double paymentAmount) throws BankingDataException {
        super(id, bankName, branchCode, accountNumber, accountType, balance, customerName, phoneNumber, transactionType, amount, depositAmount, withdrawalAmount, loanAmount, interestRate, duration);
        if (paymentAmount <= 0) throw new BankingDataException("27980 - Payment amount must be greater than 0");
        this.paymentAmount = paymentAmount;
    }
    
    public double getPaymentAmount() { return paymentAmount; }
}