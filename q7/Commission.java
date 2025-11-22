package student_27980.q7;

public class Commission extends Payment {
    private double commissionRate;
    
    public Commission(int id, String agencyName, String phoneNumber,
                      String agentName, String licenseNumber,
                      String propertyCode, String propertyType, double price,
                      String sellerName, String buyerName,
                      String terms, double paymentAmount,
                      double commissionRate) throws RealEstateDataException {
        super(id, agencyName, phoneNumber, agentName, licenseNumber, propertyCode, propertyType, price, sellerName, buyerName, terms, paymentAmount);
        if (commissionRate < 0) throw new RealEstateDataException("27980 - Commission rate cannot be negative");
        this.commissionRate = commissionRate;
    }
    
    public double getCommissionRate() { return commissionRate; }
    public double calculateCommission() { return getPrice() * commissionRate / 100; }
}