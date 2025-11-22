package student_27980.q9;

public class Flight extends Airline {
    private String flightNumber;
    private String destination;
    private String departureTime;
    
    public Flight(int id, String airlineName, String contactEmail,
                  String flightNumber, String destination, String departureTime) throws AirlineDataException {
        super(id, airlineName, contactEmail);
        if (flightNumber.isEmpty() || destination.isEmpty() || departureTime.isEmpty()) {
            throw new AirlineDataException("27980 - Flight details cannot be empty");
        }
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }
    
    public String getFlightNumber() { return flightNumber; }
    public String getDestination() { return destination; }
    public String getDepartureTime() { return departureTime; }
}