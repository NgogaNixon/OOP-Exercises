package student_27980.q5;

public class Customer extends Vehicle {
    private String customerName;
    private String licenseNumber;
    
    public Customer(int id, String companyName, String phoneNumber, 
                    String branchName, String locationCode,
                    String vehicleType, String registrationNumber, double dailyRate,
                    String customerName, String licenseNumber) throws RentalDataException {
        super(id, companyName, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate);
        if (licenseNumber.isEmpty()) throw new RentalDataException("27980 - License number cannot be empty");
        this.customerName = customerName;
        this.licenseNumber = licenseNumber;
    }
    
    public String getCustomerName() { return customerName; }
    public String getLicenseNumber() { return licenseNumber; }
}