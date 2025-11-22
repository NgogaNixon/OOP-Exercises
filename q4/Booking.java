package student_27980.q4;

public class Booking extends Customer {
    private String checkInDate;
    private String checkOutDate;
    
    public Booking(int id, String hotelName, String phoneNumber, 
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String contactNumber,
                   String checkInDate, String checkOutDate) throws HotelDataException {
        super(id, hotelName, phoneNumber, roomNumber, roomType, pricePerNight, customerName, contactNumber);
        if (checkInDate.isEmpty() || checkOutDate.isEmpty()) {
            throw new HotelDataException("27980 - Dates cannot be empty");
        }
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
    
    public String getCheckInDate() { return checkInDate; }
    public String getCheckOutDate() { return checkOutDate; }
}