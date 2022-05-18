package loopStatements;
import java.util.Scanner;
 

public class ReverseNumber {
	Integer input,i;
	long result;
	public void getinput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers to reverse");
		input = scan.nextInt();
		scan.close();
	}
	public void Reverse() 
	{
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumber reverse = new ReverseNumber();
		reverse.getinput();
		reverse.Reverse();
		

	}

}
