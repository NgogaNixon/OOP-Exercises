package student_27980.q2;

public class Exam extends Course {
    private String examName;
    private double maxMarks;
    
    public Exam(int id, String schoolName, String phoneNumber, String departmentName,
                String departmentCode, String teacherName, String subject,
                String studentName, int rollNumber, String grade,
                String courseName, String courseCode, int creditHours,
                String examName, double maxMarks) throws SchoolDataException {
        super(id, schoolName, phoneNumber, departmentName, departmentCode, teacherName, subject, studentName, rollNumber, grade, courseName, courseCode, creditHours);
        if (maxMarks <= 0) throw new SchoolDataException("27980 - Maximum marks must be greater than 0");
        this.examName = examName;
        this.maxMarks = maxMarks;
    }
    
    public String getExamName() { return examName; }
    public double getMaxMarks() { return maxMarks; }
}