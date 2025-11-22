package student_27980.q6;

public class Bank extends Entity {
    private String bankName;
    private String branchCode;
    
    public Bank(int id, String bankName, String branchCode) throws BankingDataException {
        super(id);
        if (branchCode.length() < 3) {
            throw new BankingDataException("27980 - Branch code must be at least 3 characters");
        }
        this.bankName = bankName;
        this.branchCode = branchCode;
    }
    
    public String getBankName() { return bankName; }
    public String getBranchCode() { return branchCode; }
}