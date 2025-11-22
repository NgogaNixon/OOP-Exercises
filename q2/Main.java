package student_27980.q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("27980 - === SCHOOL MANAGEMENT SYSTEM ===");
            
            System.out.print("27980 - Enter Student Name: ");
            String studentName = scanner.nextLine();
            
            System.out.print("27980 - Enter Roll Number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("27980 - Enter Grade: ");
            String grade = scanner.nextLine();
            
            System.out.print("27980 - Enter Course Name: ");
            String courseName = scanner.nextLine();
            
            System.out.print("27980 - Enter Exam Name: ");
            String examName = scanner.nextLine();
            
            System.out.print("27980 - Enter Maximum Marks: ");
            double maxMarks = scanner.nextDouble();
            
            System.out.print("27980 - Enter Obtained Marks: ");
            double obtainedMarks = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("27980 - Enter Remarks: ");
            String remarks = scanner.nextLine();
            
            System.out.print("27980 - Enter Tuition Fee: $");
            double tuitionFee = scanner.nextDouble();
            
            System.out.print("27980 - Enter Exam Fee: $");
            double examFee = scanner.nextDouble();
            
            StudentRecord record = new StudentRecord(
                1, "City High School", "1234567890", "Science", "SCI",
                "Mr. Johnson", "Mathematics", studentName, rollNumber, grade,
                courseName, "MATH101", 3, examName, maxMarks, obtainedMarks, remarks,
                tuitionFee, examFee
            );
            
            System.out.println("\n27980 - === RECORD GENERATED ===");
            record.displayStudentRecord();
            
        } catch (SchoolDataException e) {
            System.out.println("27980 - Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("27980 - Invalid input");
        } finally {
            scanner.close();
        }
    }
}