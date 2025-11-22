package student_27980.q2;

public final class StudentRecord extends Fee {
    public StudentRecord(int id, String schoolName, String phoneNumber, String departmentName,
                        String departmentCode, String teacherName, String subject,
                        String studentName, int rollNumber, String grade,
                        String courseName, String courseCode, int creditHours,
                        String examName, double maxMarks, double obtainedMarks, String remarks,
                        double tuitionFee, double examFee) throws SchoolDataException {
        super(id, schoolName, phoneNumber, departmentName, departmentCode, teacherName, subject, studentName, rollNumber, grade, courseName, courseCode, creditHours, examName, maxMarks, obtainedMarks, remarks, tuitionFee, examFee);
    }
    
    public void displayStudentRecord() {
        double average = calculateAverageMarks();
        System.out.println("27980 - === STUDENT RECORD ===");
        System.out.println("27980 - Student: " + getStudentName() + " (Roll: " + getRollNumber() + ")");
        System.out.println("27980 - School: " + getSchoolName() + " | Grade: " + getGrade());
        System.out.println("27980 - Department: " + getDepartmentName() + " (" + getDepartmentCode() + ")");
        System.out.println("27980 - Teacher: " + getTeacherName() + " - " + getSubject());
        System.out.println("27980 - Course: " + getCourseName() + " (" + getCourseCode() + ")");
        System.out.println("27980 - Exam: " + getExamName() + " | Marks: " + getObtainedMarks() + "/" + getMaxMarks());
        System.out.println("27980 - Average: " + String.format("%.2f", average) + "% | Remarks: " + getRemarks());
        System.out.println("27980 - Tuition Fee: $" + getTuitionFee());
        System.out.println("27980 - Exam Fee: $" + getExamFee());
        System.out.println("27980 - TOTAL FEE: $" + getTotalFee());
        System.out.println("27980 - =======================");
    }
}