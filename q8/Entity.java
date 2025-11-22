package student_27980.q8;

public class Entity {
    private int id;
    
    public Entity(int id) throws LibraryDataException {
        if (id <= 0) throw new LibraryDataException("27980 - ID must be greater than 0");
        this.id = id;
    }
    
    public int getId() { return id; }
}