package student_27980.q6;

public class Deposit extends Transaction {
    private double depositAmount;
    
    public Deposit(int id, String bankName, String branchCode,
                   String accountNumber, String accountType, double balance,
                   String customerName, String phoneNumber,
                   String transactionType, double amount,
                   double depositAmount) throws BankingDataException {
        super(id, bankName, branchCode, accountNumber, accountType, balance, customerName, phoneNumber, transactionType, amount);
        if (depositAmount <= 0) throw new BankingDataException("27980 - Deposit amount must be greater than 0");
        this.depositAmount = depositAmount;
    }
    
    public double getDepositAmount() { return depositAmount; }
}