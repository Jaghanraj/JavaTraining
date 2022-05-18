package loopStatements;
import java.util.Scanner;

public class DoWhile {
	int i,input;
	public void getinput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value for multiplication table");
		input = scan.nextInt();
		scan.close();
		
	}
	public void multiply()
	{
		i=1;
		do
		{
			System.out.println(i+"X"+input+"="+(i*input));
			i++;
		}while(i<=10);
		 
	}

	public static void main(String[] args) {
		 DoWhile multi = new DoWhile();
		 multi.getinput();
		 multi.multiply();
	}

}
