package student_27980.q7;

public class Agency extends Entity {
    private String agencyName;
    private String phoneNumber;
    
    public Agency(int id, String agencyName, String phoneNumber) throws RealEstateDataException {
        super(id);
        if (!phoneNumber.matches("\\d{10}")) {
            throw new RealEstateDataException("27980 - Phone must be 10 digits");
        }
        this.agencyName = agencyName;
        this.phoneNumber = phoneNumber;
    }
    
    public String getAgencyName() { return agencyName; }
    public String getPhoneNumber() { return phoneNumber; }
}