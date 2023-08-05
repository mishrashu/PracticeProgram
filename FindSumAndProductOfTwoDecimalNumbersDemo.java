import java.util.Scanner;

public class FindSumAndProductOfTwoDecimalNumbersDemo {
    public static void main(String[] args) {
        //Write a Java program to calculate the sum and product of two decimal numbers.
        float num1;
        float num2;
        float sum;
        float product;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num1: ");
        num1 = scanner.nextFloat();

        System.out.println("Enter num2: ");
        num2 = scanner.nextFloat();

        sum = num1 + num2;
        product = num1 * num2;

        System.out.println("Sum: " + sum + " Product: " + product);
        
        if(scanner != null) {
        	scanner.close();
        }
    }
}
