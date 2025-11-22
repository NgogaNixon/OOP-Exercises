package student_27980.q9;

public class Entity {
    private int id;
    
    public Entity(int id) throws AirlineDataException {
        if (id <= 0) throw new AirlineDataException("27980 - ID must be greater than 0");
        this.id = id;
    }
    
    public int getId() { return id; }
}