import java.util.Scanner;

public class SwapTwoVariablesWithoutUsingThirdVariableDemo {
    public static void main(String[] args) {
        //Write a Java program to swap two variables without using the third variable.
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num1: ");
        num1 = scanner.nextInt();

        System.out.println("Enter num2: ");
        num2 = scanner.nextInt();

        System.out.println("Before swap: num1= " + num1 + " num2= " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swap: num1= " + num1 + " num2= " + num2);
        
        if(scanner != null) {
        	scanner.close();
        }
    }
}
