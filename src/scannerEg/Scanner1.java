package scannerEg;
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = scan.nextLine();
		System.out.println("The entered string is : " + str);
		scan.close();

	}

}
