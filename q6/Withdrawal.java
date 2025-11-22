package student_27980.q6;

public class Withdrawal extends Deposit {
    private double withdrawalAmount;
    
    public Withdrawal(int id, String bankName, String branchCode,
                      String accountNumber, String accountType, double balance,
                      String customerName, String phoneNumber,
                      String transactionType, double amount,
                      double depositAmount, double withdrawalAmount) throws BankingDataException {
        super(id, bankName, branchCode, accountNumber, accountType, balance, customerName, phoneNumber, transactionType, amount, depositAmount);
        if (withdrawalAmount <= 0) throw new BankingDataException("27980 - Withdrawal amount must be greater than 0");
        this.withdrawalAmount = withdrawalAmount;
    }
    
    public double getWithdrawalAmount() { return withdrawalAmount; }
}