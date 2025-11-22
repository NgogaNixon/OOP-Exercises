package student_27980.q8;

public class Fine extends Borrow {
    private double fineAmount;
    private int daysLate;
    
    public Fine(int id, String libraryName, String phoneNumber,
                String sectionName, String sectionCode,
                String title, String author, String ISBN,
                String memberName, int memberId,
                String borrowDate, String returnDate,
                double fineAmount, int daysLate) throws LibraryDataException {
        super(id, libraryName, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, borrowDate, returnDate);
        if (fineAmount < 0) throw new LibraryDataException("27980 - Fine amount cannot be negative");
        if (daysLate < 0) throw new LibraryDataException("27980 - Days late cannot be negative");
        this.fineAmount = fineAmount;
        this.daysLate = daysLate;
    }
    
    public double getFineAmount() { return fineAmount; }
    public int getDaysLate() { return daysLate; }
    public double calculateFine() { return fineAmount * daysLate; }
}