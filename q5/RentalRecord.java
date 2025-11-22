package student_27980.q5;

public final class RentalRecord extends Invoice {
    public RentalRecord(int id, String companyName, String phoneNumber, 
                       String branchName, String locationCode,
                       String vehicleType, String registrationNumber, double dailyRate,
                       String customerName, String licenseNumber,
                       int rentalDays, double rentalCharge, double penaltyCharge,
                       String paymentMode, double totalCharge) throws RentalDataException {
        super(id, companyName, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, rentalDays, rentalCharge, penaltyCharge, paymentMode, totalCharge);
    }
    
    public void displayRentalRecord() {
        System.out.println("27980 - === VEHICLE RENTAL RECORD ===");
        System.out.println("27980 - Company: " + getCompanyName());
        System.out.println("27980 - Branch: " + getBranchName() + " (" + getLocationCode() + ")");
        System.out.println("27980 - Customer: " + getCustomerName() + " | License: " + getLicenseNumber());
        System.out.println("27980 - Vehicle: " + getVehicleType() + " | Reg: " + getRegistrationNumber());
        System.out.println("27980 - Daily Rate: $" + getDailyRate() + " | Days: " + getRentalDays());
        System.out.println("27980 - Rental Charge: $" + getRentalCharge());
        System.out.println("27980 - Penalty Charge: $" + getPenaltyCharge());
        System.out.println("27980 - Payment Mode: " + getPaymentMode());
        System.out.println("27980 - Calculated Total: $" + calculateTotalCharge());
        System.out.println("27980 - Invoice Total: $" + getTotalCharge());
        System.out.println("27980 - ==============================");
    }
}