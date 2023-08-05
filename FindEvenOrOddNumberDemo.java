import java.util.Scanner;

public class FindEvenOrOddNumberDemo {
    public static void main(String[] args) {
        //Write a Java program to find whether the given number is even or odd using ifelse.
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to be checked for even or odd: ");
        number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
        
        if(scanner != null) {
        	scanner.close();
        }
    }
}
