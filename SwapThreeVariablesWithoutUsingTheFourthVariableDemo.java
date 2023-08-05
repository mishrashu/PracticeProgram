import java.util.Scanner;

public class SwapThreeVariablesWithoutUsingTheFourthVariableDemo {
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter num1: ");
		num1 = scanner.nextInt();

		System.out.print("Enter num2: ");
		num2 = scanner.nextInt();

		System.out.print("Enter num3: ");
		num3 = scanner.nextInt();

		System.out.println("Before swap: num1= " + num1 + " ,num2= " + num2 + " ,num3= " + num3);

		num1 = num1 + (num2 + num3);
		num2 = num1 - (num2 + num3);
		num3 = num1 - (num2 + num3);
		num1 = num1 - (num2 + num3);

		System.out.println("After swap: num1= " + num1 + " ,num2= " + num2 + " ,num3= " + num3);

		if (scanner != null) {
			scanner.close();
		}
	}
}
