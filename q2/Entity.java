package student_27980.q2;

public class Entity {
    private int id;
    
    public Entity(int id) throws SchoolDataException {
        if (id <= 0) throw new SchoolDataException("27980 - ID must be greater than 0");
        this.id = id;
    }
    
    public int getId() { return id; }
}