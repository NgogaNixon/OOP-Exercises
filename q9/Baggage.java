package student_27980.q9;

public class Baggage extends Ticket {
    private double baggageWeight;
    private double baggageFee;
    
    public Baggage(int id, String airlineName, String contactEmail,
                   String flightNumber, String destination, String departureTime,
                   String passengerName, String passportNumber,
                   String seatNumber, String seatType,
                   String ticketNumber, double price,
                   double baggageWeight, double baggageFee) throws AirlineDataException {
        super(id, airlineName, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, seatNumber, seatType, ticketNumber, price);
        if (baggageWeight < 0 || baggageFee < 0) {
            throw new AirlineDataException("27980 - Baggage weight and fee cannot be negative");
        }
        this.baggageWeight = baggageWeight;
        this.baggageFee = baggageFee;
    }
    
    public double getBaggageWeight() { return baggageWeight; }
    public double getBaggageFee() { return baggageFee; }
}