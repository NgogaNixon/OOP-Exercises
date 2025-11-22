package student_27980.q4;

public class Entity {
    private int id;
    
    public Entity(int id) throws HotelDataException {
        if (id <= 0) throw new HotelDataException("27980 - ID must be greater than 0");
        this.id = id;
    }
    
    public int getId() { return id; }
}