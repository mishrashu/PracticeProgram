import java.util.Scanner;

public class SwapTwoVariablesUsingThirdVariableDemo {
    public static void main(String[] args) {
        //Write a Java program to swap two variables using the third variable
        int num1;
        int num2;
        int temp;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1: ");
        num1 = scanner.nextInt();

        System.out.println("Enter nu2: ");
        num2 = scanner.nextInt();

        System.out.println("Before swap: num1= " + num1 + " num2= " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swap: num1= " + num1 + " num2= " + num2);
        
        if(scanner != null) {
        	scanner.close();
        }

    }
}
