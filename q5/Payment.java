package student_27980.q5;

public class Payment extends Charge {
    private String paymentMode;
    
    public Payment(int id, String companyName, String phoneNumber, 
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate,
                   String customerName, String licenseNumber,
                   int rentalDays, double rentalCharge, double penaltyCharge,
                   String paymentMode) throws RentalDataException {
        super(id, companyName, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, rentalDays, rentalCharge, penaltyCharge);
        if (paymentMode.isEmpty()) throw new RentalDataException("27980 - Payment mode cannot be empty");
        this.paymentMode = paymentMode;
    }
    
    public String getPaymentMode() { return paymentMode; }
}