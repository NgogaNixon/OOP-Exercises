package student_27980.q7;

public class Entity {
    private int id;
    
    public Entity(int id) throws RealEstateDataException {
        if (id <= 0) throw new RealEstateDataException("27980 - ID must be greater than 0");
        this.id = id;
    }
    
    public int getId() { return id; }
}