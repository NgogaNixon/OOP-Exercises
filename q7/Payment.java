package student_27980.q7;

public class Payment extends Agreement {
    private double paymentAmount;
    
    public Payment(int id, String agencyName, String phoneNumber,
                   String agentName, String licenseNumber,
                   String propertyCode, String propertyType, double price,
                   String sellerName, String buyerName,
                   String terms, double paymentAmount) throws RealEstateDataException {
        super(id, agencyName, phoneNumber, agentName, licenseNumber, propertyCode, propertyType, price, sellerName, buyerName, terms);
        if (paymentAmount <= 0) throw new RealEstateDataException("27980 - Payment amount must be greater than 0");
        this.paymentAmount = paymentAmount;
    }
    
    public double getPaymentAmount() { return paymentAmount; }
}