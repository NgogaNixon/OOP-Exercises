package student_27980.q3;

public class Entity {
    private int id;
    
    public Entity(int id) throws PayrollDataException {
        if (id <= 0) throw new PayrollDataException("27980 - ID must be greater than 0");
        this.id = id;
    }
    
    public int getId() { return id; }
}