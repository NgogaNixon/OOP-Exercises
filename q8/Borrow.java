package student_27980.q8;

public class Borrow extends Member {
    private String borrowDate;
    private String returnDate;
    
    public Borrow(int id, String libraryName, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId,
                  String borrowDate, String returnDate) throws LibraryDataException {
        super(id, libraryName, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId);
        if (borrowDate.isEmpty() || returnDate.isEmpty()) {
            throw new LibraryDataException("27980 - Dates cannot be empty");
        }
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }
    
    public String getBorrowDate() { return borrowDate; }
    public String getReturnDate() { return returnDate; }
}