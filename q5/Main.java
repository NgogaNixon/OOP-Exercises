package student_27980.q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("27980 - === VEHICLE RENTAL SYSTEM ===");
            
            System.out.print("27980 - Enter Customer Name: ");
            String customerName = scanner.nextLine();
            
            System.out.print("27980 - Enter License Number: ");
            String licenseNumber = scanner.nextLine();
            
            System.out.print("27980 - Enter Vehicle Type: ");
            String vehicleType = scanner.nextLine();
            
            System.out.print("27980 - Enter Registration Number: ");
            String registrationNumber = scanner.nextLine();
            
            System.out.print("27980 - Enter Rental Days: ");
            int rentalDays = scanner.nextInt();
            

            System.out.print("27980 - Enter Rental Charge: $");
            double rentalCharge = scanner.nextDouble();
            
            System.out.print("27980 - Enter Penalty Charge: $");
            double penaltyCharge = scanner.nextDouble();
            
            scanner.nextLine(); 
            
            System.out.print("27980 - Enter Payment Mode: ");
            String paymentMode = scanner.nextLine();
            
            System.out.print("27980 - Enter Total Charge: $");
            double totalCharge = scanner.nextDouble();
            
            RentalRecord rental = new RentalRecord(
                1, "Speedy Rentals", "1234567890", "Downtown", "DTN",
                vehicleType, registrationNumber, 50.0, customerName, licenseNumber,
                rentalDays, rentalCharge, penaltyCharge, paymentMode, totalCharge
            );
            
            System.out.println("\n27980 - === RENTAL CONFIRMED ===");
            rental.displayRentalRecord();
            
        } catch (RentalDataException e) {
            System.out.println("27980 - Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("27980 - Invalid input");
        } finally {
            scanner.close();
        }
    }
}