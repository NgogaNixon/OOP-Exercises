package student_27980.q8;

public class Book extends Section {
    private String title;
    private String author;
    private String ISBN;
    
    public Book(int id, String libraryName, String phoneNumber,
                String sectionName, String sectionCode,
                String title, String author, String ISBN) throws LibraryDataException {
        super(id, libraryName, phoneNumber, sectionName, sectionCode);
        if (ISBN.length() < 10) throw new LibraryDataException("27980 - ISBN must be at least 10 characters");
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
}