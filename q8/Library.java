package student_27980.q8;

public class Library extends Entity {
    private String libraryName;
    private String phoneNumber;
    
    public Library(int id, String libraryName, String phoneNumber) throws LibraryDataException {
        super(id);
        if (!phoneNumber.matches("\\d{10}")) {
            throw new LibraryDataException("27980 - Phone must be 10 digits");
        }
        this.libraryName = libraryName;
        this.phoneNumber = phoneNumber;
    }
    
    public String getLibraryName() { return libraryName; }
    public String getPhoneNumber() { return phoneNumber; }
}