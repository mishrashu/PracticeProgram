import java.util.Scanner;

public class StarPatternDemo {

	public static void main(String[] args) {

		int numberOfRows;
		
		Scanner sc = new Scanner(System.in);
		numberOfRows = sc.nextInt();
		
		if (numberOfRows > 0) {
			for (int i = 0; i < numberOfRows; i++) {
				for (int j = (numberOfRows - i); j > 1; j--) {
					System.out.print(" ");
				}
				
				for (int k = 0; k < i + 1; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		if(sc != null)
			sc.close();

	}

}
