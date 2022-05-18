package scannerEg;
import java.util.Scanner;

public class ScannerEgAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value :");
		Integer value1 = scan.nextInt();
		Integer value2 = scan.nextInt();
		System.out.println("The add value is :" + value1*value2);
		scan.close();
	}

}
