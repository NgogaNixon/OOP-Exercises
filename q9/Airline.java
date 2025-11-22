package student_27980.q9;

public class Airline extends Entity {
    private String airlineName;
    private String contactEmail;
    
    public Airline(int id, String airlineName, String contactEmail) throws AirlineDataException {
        super(id);
        if (!contactEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new AirlineDataException("27980 - Invalid email format");
        }
        this.airlineName = airlineName;
        this.contactEmail = contactEmail;
    }
    
    public String getAirlineName() { return airlineName; }
    public String getContactEmail() { return contactEmail; }
}