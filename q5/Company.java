package student_27980.q5;

public class Company extends Entity {
    private String companyName;
    private String phoneNumber;
    
    public Company(int id, String companyName, String phoneNumber) throws RentalDataException {
        super(id);
        if (!phoneNumber.matches("\\d{10}")) {
            throw new RentalDataException("27980 - Phone must be 10 digits");
        }
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
    }
    
    public String getCompanyName() { return companyName; }
    public String getPhoneNumber() { return phoneNumber; }
}