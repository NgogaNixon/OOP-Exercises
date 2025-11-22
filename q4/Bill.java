package student_27980.q4;

public class Bill extends Payment {
    private double roomCharge;
    
    public Bill(int id, String hotelName, String phoneNumber, 
                String roomNumber, String roomType, double pricePerNight,
                String customerName, String contactNumber,
                String checkInDate, String checkOutDate,
                String serviceName, double serviceCost,
                String paymentMethod, double roomCharge) throws HotelDataException {
        super(id, hotelName, phoneNumber, roomNumber, roomType, pricePerNight, customerName, contactNumber, checkInDate, checkOutDate, serviceName, serviceCost, paymentMethod);
        if (roomCharge <= 0) throw new HotelDataException("27980 - Room charge must be greater than 0");
        this.roomCharge = roomCharge;
    }
    
    public double getRoomCharge() { return roomCharge; }
    public double getServiceCharge() { return getServiceCost(); }
    public double generateBill() { return roomCharge + getServiceCharge(); }
}