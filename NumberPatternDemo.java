import java.util.Scanner;

public class NumberPatternDemo {

	public static void main(String[] args) {

		int numberOfRows;
		Scanner sc = new Scanner(System.in);
		numberOfRows = sc.nextInt();
		if (numberOfRows > 0) {
			for (int i = 0; i < numberOfRows; i++) {
				for (int j = 0; j < i + 1; j++) {
					System.out.print(i + 1);
				}
				System.out.println();
			}
		}
		sc.close();
	}

}
