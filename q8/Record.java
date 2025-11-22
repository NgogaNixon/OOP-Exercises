package student_27980.q8;

public class Record extends Payment {
    private double totalFine;
    
    public Record(int id, String libraryName, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId,
                  String borrowDate, String returnDate,
                  double fineAmount, int daysLate,
                  String paymentMode, double totalFine) throws LibraryDataException {
        super(id, libraryName, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, borrowDate, returnDate, fineAmount, daysLate, paymentMode);
        if (totalFine <= 0) throw new LibraryDataException("27980 - Total fine must be greater than 0");
        this.totalFine = totalFine;
    }
    
    public double getTotalFine() { return totalFine; }
}