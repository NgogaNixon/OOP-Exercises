package student_27980.q2;

public class Student extends Teacher {
    private String studentName;
    private int rollNumber;
    private String grade;
    
    public Student(int id, String schoolName, String phoneNumber, String departmentName,
                   String departmentCode, String teacherName, String subject,
                   String studentName, int rollNumber, String grade) throws SchoolDataException {
        super(id, schoolName, phoneNumber, departmentName, departmentCode, teacherName, subject);
        if (rollNumber <= 0) throw new SchoolDataException("27980 - Roll number must be greater than 0");
        if (grade.isEmpty()) throw new SchoolDataException("27980 - Grade cannot be empty");
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
    
    public String getStudentName() { return studentName; }
    public int getRollNumber() { return rollNumber; }
    public String getGrade() { return grade; }
}