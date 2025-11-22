package student_27980.q4;

public class Payment extends Service {
    private String paymentMethod;
    
    public Payment(int id, String hotelName, String phoneNumber, 
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String contactNumber,
                   String checkInDate, String checkOutDate,
                   String serviceName, double serviceCost,
                   String paymentMethod) throws HotelDataException {
        super(id, hotelName, phoneNumber, roomNumber, roomType, pricePerNight, customerName, contactNumber, checkInDate, checkOutDate, serviceName, serviceCost);
        if (paymentMethod.isEmpty()) throw new HotelDataException("27980 - Payment method cannot be empty");
        this.paymentMethod = paymentMethod;
    }
    
    public String getPaymentMethod() { return paymentMethod; }
}