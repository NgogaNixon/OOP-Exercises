package student_27980.q7;

public final class RealEstateRecord extends Commission {
    public RealEstateRecord(int id, String agencyName, String phoneNumber,
                           String agentName, String licenseNumber,
                           String propertyCode, String propertyType, double price,
                           String sellerName, String buyerName,
                           String terms, double paymentAmount,
                           double commissionRate) throws RealEstateDataException {
        super(id, agencyName, phoneNumber, agentName, licenseNumber, propertyCode, propertyType, price, sellerName, buyerName, terms, paymentAmount, commissionRate);
    }
    
    public void displayRealEstateRecord() {
        System.out.println("27980 - === REAL ESTATE RECORD ===");
        System.out.println("27980 - Agency: " + getAgencyName());
        System.out.println("27980 - Agent: " + getAgentName() + " | License: " + getLicenseNumber());
        System.out.println("27980 - Property: " + getPropertyCode() + " (" + getPropertyType() + ")");
        System.out.println("27980 - Price: $" + getPrice());
        System.out.println("27980 - Seller: " + getSellerName());
        System.out.println("27980 - Buyer: " + getBuyerName());
        System.out.println("27980 - Terms: " + getTerms());
        System.out.println("27980 - Payment: $" + getPaymentAmount());
        System.out.println("27980 - Commission Rate: " + getCommissionRate() + "%");
        System.out.println("27980 - Commission Amount: $" + calculateCommission());
        System.out.println("27980 - ===========================");
    }
}