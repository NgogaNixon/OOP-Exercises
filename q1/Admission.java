package student_27980.q1;

public class Admission extends Patient {
    private int roomNumber;
    private double roomCharges;
    
    public Admission(int id, String hospitalName, String phoneNumber, String departmentName,
                     String departmentCode, String doctorName, String specialization,
                     String nurseName, String shift, String patientName, int age, String gender,
                     int roomNumber, double roomCharges) throws HospitalDataException {
        super(id, hospitalName, phoneNumber, departmentName, departmentCode, doctorName, specialization, nurseName, shift, patientName, age, gender);
        if (roomCharges <= 0) {
            throw new HospitalDataException("27980 - Room charges must be greater than 0");
        }
        this.roomNumber = roomNumber;
        this.roomCharges = roomCharges;
    }
    
    public int getRoomNumber() { return roomNumber; }
    public double getRoomCharges() { return roomCharges; }
}