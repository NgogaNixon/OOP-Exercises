package student_27980.q5;

public class Invoice extends Payment {
    private double totalCharge;
    
    public Invoice(int id, String companyName, String phoneNumber, 
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate,
                   String customerName, String licenseNumber,
                   int rentalDays, double rentalCharge, double penaltyCharge,
                   String paymentMode, double totalCharge) throws RentalDataException {
        super(id, companyName, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, rentalDays, rentalCharge, penaltyCharge, paymentMode);
        if (totalCharge <= 0) throw new RentalDataException("27980 - Total charge must be greater than 0");
        this.totalCharge = totalCharge;
    }
    
    public double getTotalCharge() { return totalCharge; }
    public double calculateTotalCharge() { return getRentalCharge() + getPenaltyCharge(); }
}