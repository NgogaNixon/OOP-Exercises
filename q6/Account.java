package student_27980.q6;

public class Account extends Bank {
    private String accountNumber;
    private String accountType;
    private double balance;
    
    public Account(int id, String bankName, String branchCode,
                   String accountNumber, String accountType, double balance) throws BankingDataException {
        super(id, bankName, branchCode);
        if (balance < 0) throw new BankingDataException("27980 - Balance cannot be negative");
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    
    public String getAccountNumber() { return accountNumber; }
    public String getAccountType() { return accountType; }
    public double getBalance() { return balance; }
}