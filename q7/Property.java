package student_27980.q7;

public class Property extends Agent {
    private String propertyCode;
    private String propertyType;
    private double price;
    
    public Property(int id, String agencyName, String phoneNumber,
                    String agentName, String licenseNumber,
                    String propertyCode, String propertyType, double price) throws RealEstateDataException {
        super(id, agencyName, phoneNumber, agentName, licenseNumber);
        if (price <= 0) throw new RealEstateDataException("27980 - Price must be greater than 0");
        this.propertyCode = propertyCode;
        this.propertyType = propertyType;
        this.price = price;
    }
    
    public String getPropertyCode() { return propertyCode; }
    public String getPropertyType() { return propertyType; }
    public double getPrice() { return price; }
}