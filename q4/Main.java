package student_27980.q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("27980 - === HOTEL RESERVATION SYSTEM ===");
            
            System.out.print("27980 - Enter Customer Name: ");
            String customerName = scanner.nextLine();
            
            System.out.print("27980 - Enter Contact Number: ");
            String contactNumber = scanner.nextLine();
            
            System.out.print("27980 - Enter Room Number: ");
            String roomNumber = scanner.nextLine();
            
            System.out.print("27980 - Enter Room Type: ");
            String roomType = scanner.nextLine();
            
            System.out.print("27980 - Enter Check-in Date: ");
            String checkInDate = scanner.nextLine();
            
            System.out.print("27980 - Enter Check-out Date: ");
            String checkOutDate = scanner.nextLine();
            
            System.out.print("27980 - Enter Service Name: ");
            String serviceName = scanner.nextLine();
            
            System.out.print("27980 - Enter Service Cost: $");
            double serviceCost = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("27980 - Enter Room Charge: $");
            double roomCharge = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("27980 - Enter Payment Method: ");
            String paymentMethod = scanner.nextLine();
            
            System.out.print("27980 - Enter Rating (1-5): ");
            int rating = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("27980 - Enter Comments: ");
            String comments = scanner.nextLine();
            
            ReservationRecord reservation = new ReservationRecord(
                1, "Grand Plaza Hotel", "1234567890", 
                roomNumber, roomType, 100.0, customerName, contactNumber,
                checkInDate, checkOutDate, serviceName, serviceCost,
                paymentMethod, roomCharge, rating, comments
            );
            
            System.out.println("\n27980 - === RESERVATION CONFIRMED ===");
            reservation.displayReservation();
            
        } catch (HotelDataException e) {
            System.out.println("27980 - Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("27980 - Invalid input");
        } finally {
            scanner.close();
        }
    }
}