package student_27980.q5;

public class Charge extends Rental {
    private double rentalCharge;
    private double penaltyCharge;
    
    public Charge(int id, String companyName, String phoneNumber, 
                  String branchName, String locationCode,
                  String vehicleType, String registrationNumber, double dailyRate,
                  String customerName, String licenseNumber,
                  int rentalDays, double rentalCharge, double penaltyCharge) throws RentalDataException {
        super(id, companyName, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, rentalDays);
        if (rentalCharge < 0 || penaltyCharge < 0) {
            throw new RentalDataException("27980 - Charges cannot be negative");
        }
        this.rentalCharge = rentalCharge;
        this.penaltyCharge = penaltyCharge;
    }
    
    public double getRentalCharge() { return rentalCharge; }
    public double getPenaltyCharge() { return penaltyCharge; }
}