package student_27980.q4;

public class Customer extends Room {
    private String customerName;
    private String contactNumber;
    
    public Customer(int id, String hotelName, String phoneNumber, 
                    String roomNumber, String roomType, double pricePerNight,
                    String customerName, String contactNumber) throws HotelDataException {
        super(id, hotelName, phoneNumber, roomNumber, roomType, pricePerNight);
        if (!contactNumber.matches("\\d{10}")) {
            throw new HotelDataException("27980 - Contact number must be 10 digits");
        }
        this.customerName = customerName;
        this.contactNumber = contactNumber;
    }
    
    public String getCustomerName() { return customerName; }
    public String getContactNumber() { return contactNumber; }
}