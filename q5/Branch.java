package student_27980.q5;

public class Branch extends Company {
    private String branchName;
    private String locationCode;
    
    public Branch(int id, String companyName, String phoneNumber, 
                  String branchName, String locationCode) throws RentalDataException {
        super(id, companyName, phoneNumber);
        if (locationCode.length() < 3) {
            throw new RentalDataException("27980 - Location code must be at least 3 characters");
        }
        this.branchName = branchName;
        this.locationCode = locationCode;
    }
    
    public String getBranchName() { return branchName; }
    public String getLocationCode() { return locationCode; }
}