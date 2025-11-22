package student_27980.q8;

public class Section extends Library {
    private String sectionName;
    private String sectionCode;
    
    public Section(int id, String libraryName, String phoneNumber,
                   String sectionName, String sectionCode) throws LibraryDataException {
        super(id, libraryName, phoneNumber);
        if (sectionCode.length() < 3) {
            throw new LibraryDataException("27980 - Section code must be at least 3 characters");
        }
        this.sectionName = sectionName;
        this.sectionCode = sectionCode;
    }
    
    public String getSectionName() { return sectionName; }
    public String getSectionCode() { return sectionCode; }
}