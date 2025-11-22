package student_27980.q2;

public class Fee extends Result {
    private double tuitionFee;
    private double examFee;
    
    public Fee(int id, String schoolName, String phoneNumber, String departmentName,
               String departmentCode, String teacherName, String subject,
               String studentName, int rollNumber, String grade,
               String courseName, String courseCode, int creditHours,
               String examName, double maxMarks, double obtainedMarks, String remarks,
               double tuitionFee, double examFee) throws SchoolDataException {
        super(id, schoolName, phoneNumber, departmentName, departmentCode, teacherName, subject, studentName, rollNumber, grade, courseName, courseCode, creditHours, examName, maxMarks, obtainedMarks, remarks);
        if (tuitionFee <= 0 || examFee <= 0) {
            throw new SchoolDataException("27980 - Fees must be greater than 0");
        }
        this.tuitionFee = tuitionFee;
        this.examFee = examFee;
    }
    
    public double getTuitionFee() { return tuitionFee; }
    public double getExamFee() { return examFee; }
    public double getTotalFee() { return tuitionFee + examFee; }
}