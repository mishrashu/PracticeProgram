import java.util.Scanner;

public class CelciusToFahrenheitConversionDemo {
	public static void main(String[] args) {
		// Write a Java program to convert celsius to Fahrenheit (Fahrenheit = ( Celsius
		// × 1.8 ) + 32)
		double fahrenheit;
		double celcius;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value in Celcius: ");
		celcius = scanner.nextDouble();
		fahrenheit = ((celcius * 1.8) + 32);
		System.out.println("Celcius: " + celcius + " in Fahrenheit is " + fahrenheit);

		if (scanner != null) {
			scanner.close();
		}

	}
}
