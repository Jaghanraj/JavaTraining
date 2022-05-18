package loopStatements;
import java.util.Scanner;

public class FactorialValue {
	Integer input,i,fact=1;
	public void getinput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		input = scan.nextInt();
		scan.close();
	}
	public void Factorial()
	{
		 for(i=1;i<=input;i++)
		 {
			 fact = fact*i;
			 
		 }
		 System.out.println("Factorial of a number :" +fact);
	}

	public static void main(String[] args) {
		FactorialValue value = new FactorialValue();
		value.getinput();
		value.Factorial();
		 

	}

}
