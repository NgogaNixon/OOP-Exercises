package student_27980.q6;

public class Loan extends Withdrawal {
    private double loanAmount;
    private double interestRate;
    private int duration;
    
    public Loan(int id, String bankName, String branchCode,
                String accountNumber, String accountType, double balance,
                String customerName, String phoneNumber,
                String transactionType, double amount,
                double depositAmount, double withdrawalAmount,
                double loanAmount, double interestRate, int duration) throws BankingDataException {
        super(id, bankName, branchCode, accountNumber, accountType, balance, customerName, phoneNumber, transactionType, amount, depositAmount, withdrawalAmount);
        if (loanAmount <= 0 || interestRate <= 0 || duration <= 0) {
            throw new BankingDataException("27980 - Loan amount, interest rate, and duration must be greater than 0");
        }
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.duration = duration;
    }
    
    public double getLoanAmount() { return loanAmount; }
    public double getInterestRate() { return interestRate; }
    public int getDuration() { return duration; }
    
    public double calculateInterest() {
        return (loanAmount * interestRate * duration) / 100;
    }
}