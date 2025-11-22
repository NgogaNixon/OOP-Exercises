package student_27980.q6;

public class Customer extends Account {
    private String customerName;
    private String phoneNumber;
    
    public Customer(int id, String bankName, String branchCode,
                    String accountNumber, String accountType, double balance,
                    String customerName, String phoneNumber) throws BankingDataException {
        super(id, bankName, branchCode, accountNumber, accountType, balance);
        if (!phoneNumber.matches("\\d{10}")) {
            throw new BankingDataException("27980 - Phone number must be 10 digits");
        }
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }
    
    public String getCustomerName() { return customerName; }
    public String getPhoneNumber() { return phoneNumber; }
}