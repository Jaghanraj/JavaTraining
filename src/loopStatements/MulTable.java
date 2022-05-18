package loopStatements;
import java.util.Scanner;

public class MulTable {
	Integer i,input;
	public void getinput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		input = scan.nextInt();
		scan.close();
	}
	public void Mul()
	{
		for(i=1;i<=10;i++)
		{
			System.out.println(i+"X"+input+"="+(i*input));
		}
	}

	public static void main(String[] args) {
		MulTable multiple = new MulTable();
		multiple.getinput();
		multiple.Mul();
		 

	}

}
