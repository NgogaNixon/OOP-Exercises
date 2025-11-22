package student_27980.q5;

public class Entity {
    private int id;
    
    public Entity(int id) throws RentalDataException {
        if (id <= 0) throw new RentalDataException("27980 - ID must be greater than 0");
        this.id = id;
    }
    
    public int getId() { return id; }
}