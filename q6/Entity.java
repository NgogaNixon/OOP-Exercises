package student_27980.q6;

public class Entity {
    private int id;
    
    public Entity(int id) throws BankingDataException {
        if (id <= 0) throw new BankingDataException("27980 - ID must be greater than 0");
        this.id = id;
    }
    
    public int getId() { return id; }
}