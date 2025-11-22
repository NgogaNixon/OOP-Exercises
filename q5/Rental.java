package student_27980.q5;

public class Rental extends Customer {
    private int rentalDays;
    
    public Rental(int id, String companyName, String phoneNumber, 
                  String branchName, String locationCode,
                  String vehicleType, String registrationNumber, double dailyRate,
                  String customerName, String licenseNumber,
                  int rentalDays) throws RentalDataException {
        super(id, companyName, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber);
        if (rentalDays <= 0) throw new RentalDataException("27980 - Rental days must be greater than 0");
        this.rentalDays = rentalDays;
    }
    
    public int getRentalDays() { return rentalDays; }
}