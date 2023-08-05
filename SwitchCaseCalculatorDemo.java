import java.util.Scanner;

public class SwitchCaseCalculatorDemo {

	public static void main(String[] args) {

		int number1;
		int number2;
		int choice = 0;
		Scanner sc = new Scanner(System.in);

		while (choice != 6) {
		
			System.out.printf("%-15s\n", "1. Addition");
			System.out.printf("%-15s\n", "2. Subtraction");
			System.out.printf("%-15s\n", "3. Multiplication");
			System.out.printf("%-15s\n", "4. Division");
			System.out.printf("%-15s\n", "5. Remainder");
			System.out.printf("%-15s\n", "6. Quit");

			choice = sc.nextInt();
			
			number1 =(int) sc.nextInt();
			number2 = (int)sc.nextInt();
			sc.next().charAt(0);

			switch (choice) {
			case 1:
				System.out.println("Addition of " + number1 + " & " + number2 + ": " + (number1 + number2));
				break;
			case 2:
				System.out.println("Suntraction of " + number1 + " & " + number2 + ": " + (number1 - number2));
				break;
			case 3:
				System.out.println("Multiplication of " + number1 + " & " + number2 + ": " + (number1 * number2));
				break;
			case 4:
				if(number2==0) {
					System.out.println("Cannot be divided");
					break;
				}
				
				System.out.println("Division of " + number1 + " & " + number2 + ": " + (number1 / number2));
				break;
			case 5:
				System.out.println("Remainder of " + number1 + " & " + number2 + ": " + (number1 % number2));
				break;
			case 6:
				break;
			default:
				break;
			}
		}
		sc.close();
	}

}