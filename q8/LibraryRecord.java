package student_27980.q8;

public final class LibraryRecord extends Record {
    public LibraryRecord(int id, String libraryName, String phoneNumber,
                        String sectionName, String sectionCode,
                        String title, String author, String ISBN,
                        String memberName, int memberId,
                        String borrowDate, String returnDate,
                        double fineAmount, int daysLate,
                        String paymentMode, double totalFine) throws LibraryDataException {
        super(id, libraryName, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, borrowDate, returnDate, fineAmount, daysLate, paymentMode, totalFine);
    }
    
    public void displayLibraryRecord() {
        System.out.println("27980 - === LIBRARY MANAGEMENT RECORD ===");
        System.out.println("27980 - Library: " + getLibraryName());
        System.out.println("27980 - Section: " + getSectionName() + " (" + getSectionCode() + ")");
        System.out.println("27980 - Book: " + getTitle() + " by " + getAuthor());
        System.out.println("27980 - ISBN: " + getISBN());
        System.out.println("27980 - Member: " + getMemberName() + " (ID: " + getMemberId() + ")");
        System.out.println("27980 - Borrow Date: " + getBorrowDate());
        System.out.println("27980 - Return Date: " + getReturnDate());
        System.out.println("27980 - Fine Amount: $" + getFineAmount() + " per day");
        System.out.println("27980 - Days Late: " + getDaysLate());
        System.out.println("27980 - Calculated Fine: $" + calculateFine());
        System.out.println("27980 - Payment Mode: " + getPaymentMode());
        System.out.println("27980 - Total Fine Paid: $" + getTotalFine());
        System.out.println("27980 - =================================");
    }
}