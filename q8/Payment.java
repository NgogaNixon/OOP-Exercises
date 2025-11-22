package student_27980.q8;

public class Payment extends Fine {
    private String paymentMode;
    
    public Payment(int id, String libraryName, String phoneNumber,
                   String sectionName, String sectionCode,
                   String title, String author, String ISBN,
                   String memberName, int memberId,
                   String borrowDate, String returnDate,
                   double fineAmount, int daysLate,
                   String paymentMode) throws LibraryDataException {
        super(id, libraryName, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, borrowDate, returnDate, fineAmount, daysLate);
        if (paymentMode.isEmpty()) throw new LibraryDataException("27980 - Payment mode cannot be empty");
        this.paymentMode = paymentMode;
    }
    
    public String getPaymentMode() { return paymentMode; }
}