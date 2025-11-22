package student_27980.q2;

public class Result extends Exam {
    private double obtainedMarks;
    private String remarks;
    
    public Result(int id, String schoolName, String phoneNumber, String departmentName,
                  String departmentCode, String teacherName, String subject,
                  String studentName, int rollNumber, String grade,
                  String courseName, String courseCode, int creditHours,
                  String examName, double maxMarks, double obtainedMarks, String remarks) throws SchoolDataException {
        super(id, schoolName, phoneNumber, departmentName, departmentCode, teacherName, subject, studentName, rollNumber, grade, courseName, courseCode, creditHours, examName, maxMarks);
        if (obtainedMarks < 0) throw new SchoolDataException("27980 - Obtained marks cannot be negative");
        if (remarks.isEmpty()) throw new SchoolDataException("27980 - Remarks cannot be empty");
        this.obtainedMarks = obtainedMarks;
        this.remarks = remarks;
    }
    
    public double getObtainedMarks() { return obtainedMarks; }
    public String getRemarks() { return remarks; }
    
    public double calculateAverageMarks() {
        return (obtainedMarks / getMaxMarks()) * 100;
    }
}