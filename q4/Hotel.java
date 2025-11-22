package student_27980.q4;

public class Hotel extends Entity {
    private String hotelName;
    private String phoneNumber;
    
    public Hotel(int id, String hotelName, String phoneNumber) throws HotelDataException {
        super(id);
        if (!phoneNumber.matches("\\d{10}")) {
            throw new HotelDataException("27980 - Phone must be 10 digits");
        }
        this.hotelName = hotelName;
        this.phoneNumber = phoneNumber;
    }
    
    public String getHotelName() { return hotelName; }
    public String getPhoneNumber() { return phoneNumber; }
}