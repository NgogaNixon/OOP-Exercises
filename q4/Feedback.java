package student_27980.q4;

public class Feedback extends Bill {
    private int rating;
    private String comments;
    
    public Feedback(int id, String hotelName, String phoneNumber, 
                    String roomNumber, String roomType, double pricePerNight,
                    String customerName, String contactNumber,
                    String checkInDate, String checkOutDate,
                    String serviceName, double serviceCost,
                    String paymentMethod, double roomCharge,
                    int rating, String comments) throws HotelDataException {
        super(id, hotelName, phoneNumber, roomNumber, roomType, pricePerNight, customerName, contactNumber, checkInDate, checkOutDate, serviceName, serviceCost, paymentMethod, roomCharge);
        if (rating < 1 || rating > 5) throw new HotelDataException("27980 - Rating must be between 1-5");
        this.rating = rating;
        this.comments = comments;
    }
    
    public int getRating() { return rating; }
    public String getComments() { return comments; }
}