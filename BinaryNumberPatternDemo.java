import java.util.Scanner;

public class BinaryNumberPatternDemo {

	public static void main(String[] args) {

		int count;
		int cnt = 1;
		boolean isCountAnInterger;
		Scanner sc = new Scanner(System.in);

		isCountAnInterger = sc.hasNextInt();
		if (isCountAnInterger) {
			count = sc.nextInt();
			for (int i = 0; i < count; i++) {

				if (i % 2 == 0)
					cnt = 1;
				else
					cnt = 0;
				for (int j = 0; j < count; j++) {
					System.out.print(cnt + " ");
					cnt = 1 - cnt;
				}
				System.out.println("\n");
			}
		} else {
			System.out.println("Invalid Input");
		}
		sc.close();
	}

}
