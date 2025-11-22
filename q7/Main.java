package student_27980.q7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("27980 - === REAL ESTATE MANAGEMENT SYSTEM ===");
            
            System.out.print("27980 - Enter Agency Name: ");
            String agencyName = scanner.nextLine();
            
            System.out.print("27980 - Enter Agent Name: ");
            String agentName = scanner.nextLine();
            
            System.out.print("27980 - Enter License Number: ");
            String licenseNumber = scanner.nextLine();
            
            System.out.print("27980 - Enter Property Code: ");
            String propertyCode = scanner.nextLine();
            
            System.out.print("27980 - Enter Property Type: ");
            String propertyType = scanner.nextLine();
            
            System.out.print("27980 - Enter Property Price: $");
            double price = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("27980 - Enter Seller Name: ");
            String sellerName = scanner.nextLine();
            
            System.out.print("27980 - Enter Buyer Name: ");
            String buyerName = scanner.nextLine();
            
            System.out.print("27980 - Enter Agreement Terms: ");
            String terms = scanner.nextLine();
            
            System.out.print("27980 - Enter Payment Amount: $");
            double paymentAmount = scanner.nextDouble();
            
            System.out.print("27980 - Enter Commission Rate (%): ");
            double commissionRate = scanner.nextDouble();
            
            RealEstateRecord record = new RealEstateRecord(
                1, agencyName, "1234567890", agentName, licenseNumber,
                propertyCode, propertyType, price, sellerName, buyerName,
                terms, paymentAmount, commissionRate
            );
            
            System.out.println("\n27980 - === REAL ESTATE RECORD GENERATED ===");
            record.displayRealEstateRecord();
            
        } catch (RealEstateDataException e) {
            System.out.println("27980 - Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("27980 - Invalid input");
        } finally {
            scanner.close();
        }
    }
}