package student_27980.q4;

public class Room extends Hotel {
    private String roomNumber;
    private String roomType;
    private double pricePerNight;
    
    public Room(int id, String hotelName, String phoneNumber, 
                String roomNumber, String roomType, double pricePerNight) throws HotelDataException {
        super(id, hotelName, phoneNumber);
        if (pricePerNight <= 0) throw new HotelDataException("27980 - Price must be greater than 0");
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }
    
    public String getRoomNumber() { return roomNumber; }
    public String getRoomType() { return roomType; }
    public double getPricePerNight() { return pricePerNight; }
}