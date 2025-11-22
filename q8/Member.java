package student_27980.q8;

public class Member extends Book {
    private String memberName;
    private int memberId;
    
    public Member(int id, String libraryName, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId) throws LibraryDataException {
        super(id, libraryName, phoneNumber, sectionName, sectionCode, title, author, ISBN);
        if (memberId <= 0) throw new LibraryDataException("27980 - Member ID must be greater than 0");
        this.memberName = memberName;
        this.memberId = memberId;
    }
    
    public String getMemberName() { return memberName; }
    public int getMemberId() { return memberId; }
}