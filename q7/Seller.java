package student_27980.q7;

public class Seller extends Property {
    private String sellerName;
    
    public Seller(int id, String agencyName, String phoneNumber,
                  String agentName, String licenseNumber,
                  String propertyCode, String propertyType, double price,
                  String sellerName) throws RealEstateDataException {
        super(id, agencyName, phoneNumber, agentName, licenseNumber, propertyCode, propertyType, price);
        if (sellerName.isEmpty()) throw new RealEstateDataException("27980 - Seller name cannot be empty");
        this.sellerName = sellerName;
    }
    
    public String getSellerName() { return sellerName; }
}