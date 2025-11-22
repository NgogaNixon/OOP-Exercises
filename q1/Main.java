package student_27980.q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("27980 - === HOSPITAL BILLING SYSTEM ===");
            
            System.out.print("27980 - Enter Patient Name: ");
            String patientName = scanner.nextLine();
            
            System.out.print("27980 - Enter Diagnosis: ");
            String diagnosis = scanner.nextLine();
            
            System.out.print("27980 - Enter Room Charges: $");
            double roomCharges = scanner.nextDouble();
            
            System.out.print("27980 - Enter Treatment Cost: $");
            double treatmentCost = scanner.nextDouble();
            
            System.out.print("27980 - Enter Doctor Fee: $");
            double doctorFee = scanner.nextDouble();
            
            System.out.print("27980 - Enter Medicine Cost: $");
            double medicineCost = scanner.nextDouble();
            
            Bill bill = new Bill(
                1, "General Hospital", "1234567890", "Treatment", "TRT",
                "Dr. Smith", "General", "Nurse", "Day",
                patientName, 25, "Other", 101, roomCharges,
                diagnosis, treatmentCost, doctorFee, medicineCost
            );
            
            System.out.println("\n27980 - === BILL GENERATED ===");
            bill.displayBill();
            
        } catch (HospitalDataException e) {
            System.out.println("27980 - Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("27980 - Invalid input");
        } finally {
            scanner.close();
        }
    }
}