package loopStatements;
import java.util.Scanner;

public class PrintNumber {
	Integer i,input;
	public void getinput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		input = scan.nextInt();
		scan.close();
		
	}
	public void Number()
	{
		i=1;
		do
		{
			System.out.println(i);
			i++;
		}while(i<=input);
	}

	public static void main(String[] args) {
		PrintNumber number = new PrintNumber();
		number.getinput();
		number.Number();
		 

	}

}
