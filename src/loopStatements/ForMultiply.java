package loopStatements;
import java.util.Scanner;

public class ForMultiply {
	int input;
	int i;
	
	public void getinput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value to print multiplication table");
		input = scan.nextInt();
		scan.close();
	}
	public void multiply() 
	{
		for(i =1; i<=10 ; i++)
			System.out.println(i +"X"+input+"=" +i*input);
	}

	public static void main(String[] args) {
		ForMultiply multiply = new ForMultiply();
		multiply.getinput();
		multiply.multiply();
		 
	}

}
