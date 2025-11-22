package student_27980.q7;

public class Agent extends Agency {
    private String agentName;
    private String licenseNumber;
    
    public Agent(int id, String agencyName, String phoneNumber,
                 String agentName, String licenseNumber) throws RealEstateDataException {
        super(id, agencyName, phoneNumber);
        if (licenseNumber.isEmpty()) throw new RealEstateDataException("27980 - License number cannot be empty");
        this.agentName = agentName;
        this.licenseNumber = licenseNumber;
    }
    
    public String getAgentName() { return agentName; }
    public String getLicenseNumber() { return licenseNumber; }
}