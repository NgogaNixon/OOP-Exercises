package student_27980.q7;

public class Buyer extends Seller {
    private String buyerName;
    
    public Buyer(int id, String agencyName, String phoneNumber,
                 String agentName, String licenseNumber,
                 String propertyCode, String propertyType, double price,
                 String sellerName, String buyerName) throws RealEstateDataException {
        super(id, agencyName, phoneNumber, agentName, licenseNumber, propertyCode, propertyType, price, sellerName);
        if (buyerName.isEmpty()) throw new RealEstateDataException("27980 - Buyer name cannot be empty");
        this.buyerName = buyerName;
    }
    
    public String getBuyerName() { return buyerName; }
}