package student_27980.q1;

public class Patient extends Nurse {
    private String patientName;
    private int age;
    private String gender;
    
    public Patient(int id, String hospitalName, String phoneNumber, String departmentName,
                   String departmentCode, String doctorName, String specialization,
                   String nurseName, String shift, String patientName, int age, String gender) throws HospitalDataException {
        super(id, hospitalName, phoneNumber, departmentName, departmentCode, doctorName, specialization, nurseName, shift);
        if (age <= 0) throw new HospitalDataException("27980 - Age must be greater than 0");
        if (!gender.equals("Male") && !gender.equals("Female") && !gender.equals("Other")) {
            throw new HospitalDataException("27980 - Gender must be Male/Female/Other");
        }
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
    }
    
    public String getPatientName() { return patientName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
}