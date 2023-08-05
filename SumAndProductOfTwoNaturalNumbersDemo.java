import java.util.Scanner;

public class SumAndProductOfTwoNaturalNumbersDemo {
	public static void main(String[] args) {
		// Write a Java program to calculate the sum and product of two natural numbers.
		int num1;
		int num2;

		int sum;
		int product;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter num1: ");
		num1 = scanner.nextInt();

		if (num1 < 1) {
			System.out.println("Please enter natural number only");

			if (scanner != null) {
				scanner.close();
			}
			
			return;
		}

		System.out.println("Enter num2: ");
		num2 = scanner.nextInt();

		if (num2 < 1) {
			System.out.println("Please enter natural number only");
			
			if (scanner != null) {
				scanner.close();
			}
			
			return;
		}

		sum = num1 + num2;
		product = num1 * num2;

		System.out.println("Sum: " + sum + " Product: " + product);

		if (scanner != null) {
			scanner.close();
		}

	}
}
