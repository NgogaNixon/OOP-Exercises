package student_27980.q8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("27980 - === LIBRARY MANAGEMENT SYSTEM ===");
            
            System.out.print("27980 - Enter Library Name: ");
            String libraryName = scanner.nextLine();
            
            System.out.print("27980 - Enter Section Name: ");
            String sectionName = scanner.nextLine();
            
            System.out.print("27980 - Enter Book Title: ");
            String title = scanner.nextLine();
            
            System.out.print("27980 - Enter Author: ");
            String author = scanner.nextLine();
            
            System.out.print("27980 - Enter ISBN: ");
            String ISBN = scanner.nextLine();
        
            System.out.print("27980 - Enter Member Name: ");
            String memberName = scanner.nextLine();
            
            System.out.print("27980 - Enter Member ID: ");
            int memberId = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("27980 - Enter Borrow Date: ");
            String borrowDate = scanner.nextLine();
            
            System.out.print("27980 - Enter Return Date: ");
            String returnDate = scanner.nextLine();
            
            System.out.print("27980 - Enter Fine Amount per Day: $");
            double fineAmount = scanner.nextDouble();
            
            System.out.print("27980 - Enter Days Late: ");
            int daysLate = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("27980 - Enter Payment Mode: ");
            String paymentMode = scanner.nextLine();
            
            System.out.print("27980 - Enter Total Fine Paid: $");
            double totalFine = scanner.nextDouble();
            
            LibraryRecord record = new LibraryRecord(
                1, libraryName, "1234567890", sectionName, "SEC",
                title, author, ISBN, memberName, memberId,
                borrowDate, returnDate, fineAmount, daysLate,
                paymentMode, totalFine
            );
            
            System.out.println("\n27980 - === LIBRARY RECORD GENERATED ===");
            record.displayLibraryRecord();
            
        } catch (LibraryDataException e) {
            System.out.println("27980 - Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("27980 - Invalid input");
        } finally {
            scanner.close();
        }
    }
}