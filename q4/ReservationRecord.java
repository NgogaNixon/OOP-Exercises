package student_27980.q4;

public final class ReservationRecord extends Feedback {
    public ReservationRecord(int id, String hotelName, String phoneNumber, 
                            String roomNumber, String roomType, double pricePerNight,
                            String customerName, String contactNumber,
                            String checkInDate, String checkOutDate,
                            String serviceName, double serviceCost,
                            String paymentMethod, double roomCharge,
                            int rating, String comments) throws HotelDataException {
        super(id, hotelName, phoneNumber, roomNumber, roomType, pricePerNight, customerName, contactNumber, checkInDate, checkOutDate, serviceName, serviceCost, paymentMethod, roomCharge, rating, comments);
    }
    
    public void displayReservation() {
        System.out.println("27980 - === HOTEL RESERVATION RECORD ===");
        System.out.println("27980 - Hotel: " + getHotelName());
        System.out.println("27980 - Customer: " + getCustomerName() + " | Contact: " + getContactNumber());
        System.out.println("27980 - Room: " + getRoomNumber() + " (" + getRoomType() + ")");
        System.out.println("27980 - Check-in: " + getCheckInDate() + " | Check-out: " + getCheckOutDate());
        System.out.println("27980 - Service: " + getServiceName() + " - $" + getServiceCost());
        System.out.println("27980 - Payment Method: " + getPaymentMethod());
        System.out.println("27980 - Room Charge: $" + getRoomCharge());
        System.out.println("27980 - Service Charge: $" + getServiceCharge());
        System.out.println("27980 - TOTAL BILL: $" + generateBill());
        System.out.println("27980 - Rating: " + getRating() + "/5");
        System.out.println("27980 - Comments: " + getComments());
        System.out.println("27980 - =================================");
    }
}