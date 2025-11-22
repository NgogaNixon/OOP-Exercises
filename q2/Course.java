package student_27980.q2;

public class Course extends Student {
    private String courseName;
    private String courseCode;
    private int creditHours;
    
    public Course(int id, String schoolName, String phoneNumber, String departmentName,
                  String departmentCode, String teacherName, String subject,
                  String studentName, int rollNumber, String grade,
                  String courseName, String courseCode, int creditHours) throws SchoolDataException {
        super(id, schoolName, phoneNumber, departmentName, departmentCode, teacherName, subject, studentName, rollNumber, grade);
        if (creditHours <= 0) throw new SchoolDataException("27980 - Credit hours must be greater than 0");
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHours = creditHours;
    }
    
    public String getCourseName() { return courseName; }
    public String getCourseCode() { return courseCode; }
    public int getCreditHours() { return creditHours; }
}