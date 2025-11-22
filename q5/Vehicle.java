package student_27980.q5;

public class Vehicle extends Branch {
    private String vehicleType;
    private String registrationNumber;
    private double dailyRate;
    
    public Vehicle(int id, String companyName, String phoneNumber, 
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate) throws RentalDataException {
        super(id, companyName, phoneNumber, branchName, locationCode);
        if (dailyRate <= 0) throw new RentalDataException("27980 - Daily rate must be greater than 0");
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        this.dailyRate = dailyRate;
    }
    
    public String getVehicleType() { return vehicleType; }
    public String getRegistrationNumber() { return registrationNumber; }
    public double getDailyRate() { return dailyRate; }
}