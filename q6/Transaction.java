package student_27980.q6;

public class Transaction extends Customer {
    private String transactionType;
    private double amount;
    
    public Transaction(int id, String bankName, String branchCode,
                       String accountNumber, String accountType, double balance,
                       String customerName, String phoneNumber,
                       String transactionType, double amount) throws BankingDataException {
        super(id, bankName, branchCode, accountNumber, accountType, balance, customerName, phoneNumber);
        if (amount <= 0) throw new BankingDataException("27980 - Amount must be greater than 0");
        this.transactionType = transactionType;
        this.amount = amount;
    }
    
    public String getTransactionType() { return transactionType; }
    public double getAmount() { return amount; }
}