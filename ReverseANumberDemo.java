import java.util.Scanner;

public class ReverseANumberDemo {

	public static void main(String[] args) {

		int number;
		int remainder;
		int reversedNumber = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to be reversed: ");
		number = sc.nextInt();

		while (number > 0) {
			remainder = number % 10;
			reversedNumber = (reversedNumber * 10) + remainder;
			number = number / 10;
		}
		System.out.println("Reverse of " + number + " is " + reversedNumber);
		sc.close();
	}

}