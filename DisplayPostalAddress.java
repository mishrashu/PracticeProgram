import java.util.Scanner;

public class DisplayPostalAddress {
    public static void main(String[] args) {
        //Write a Java program to display your postal address
        String postalAddress;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the postal address: ");
        postalAddress = scanner.nextLine();
        System.out.println("postalAddress: " + postalAddress);
        
        if(scanner != null) {
        	scanner.close();
        }
    }
}
