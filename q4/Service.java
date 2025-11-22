package student_27980.q4;

public class Service extends Booking {
    private String serviceName;
    private double serviceCost;
    
    public Service(int id, String hotelName, String phoneNumber, 
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String contactNumber,
                   String checkInDate, String checkOutDate,
                   String serviceName, double serviceCost) throws HotelDataException {
        super(id, hotelName, phoneNumber, roomNumber, roomType, pricePerNight, customerName, contactNumber, checkInDate, checkOutDate);
        if (serviceCost <= 0) throw new HotelDataException("27980 - Service cost must be greater than 0");
        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
    }
    
    public String getServiceName() { return serviceName; }
    public double getServiceCost() { return serviceCost; }
}