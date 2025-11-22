package student_27980.q2;

public class Teacher extends Department {
    private String teacherName;
    private String subject;
    
    public Teacher(int id, String schoolName, String phoneNumber, String departmentName,
                   String departmentCode, String teacherName, String subject) throws SchoolDataException {
        super(id, schoolName, phoneNumber, departmentName, departmentCode);
        if (subject.isEmpty()) {
            throw new SchoolDataException("27980 - Subject cannot be empty");
        }
        this.teacherName = teacherName;
        this.subject = subject;
    }
    
    public String getTeacherName() { return teacherName; }
    public String getSubject() { return subject; }
}