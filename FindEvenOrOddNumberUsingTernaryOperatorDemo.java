import java.util.Scanner;

public class FindEvenOrOddNumberUsingTernaryOperatorDemo {
    public static void main(String[] args) {
        //Write a Java program to find whether the given number is even or odd using
        //ternary operator
        int number;
        String result;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to be checked for even or odd: ");
        number = scanner.nextInt();

        result = (number % 2 == 0) ? "-Even number" : "-Odd number";
        System.out.println(number + result);
        
        if(scanner != null) {
        	scanner.close();
        }
    }
}
