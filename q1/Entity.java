package student_27980.q1;

public class Entity {
    private int id;
    
    public Entity(int id) throws HospitalDataException {
        if (id <= 0) throw new HospitalDataException("27980 - ID must be greater than 0");
        this.id = id;
    }
    
    public int getId() { return id; }
}