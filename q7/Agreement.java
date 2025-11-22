package student_27980.q7;

public class Agreement extends Buyer {
    private String terms;
    
    public Agreement(int id, String agencyName, String phoneNumber,
                     String agentName, String licenseNumber,
                     String propertyCode, String propertyType, double price,
                     String sellerName, String buyerName,
                     String terms) throws RealEstateDataException {
        super(id, agencyName, phoneNumber, agentName, licenseNumber, propertyCode, propertyType, price, sellerName, buyerName);
        if (terms.isEmpty()) throw new RealEstateDataException("27980 - Terms cannot be empty");
        this.terms = terms;
    }
    
    public String getTerms() { return terms; }
}