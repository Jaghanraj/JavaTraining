package loopStatements;
import java.util.Scanner;

public class PositiveOrNegativeIfElse {
	int num;
	public void getInput()
	{
		Scanner number = new Scanner(System.in);
		System.out.println("Enter a number to find positive or negative");
		num = number.nextInt();
		number.close();
	}
	public void getOut()
	{
		if(num>0)
		{
			System.out.println("Entered number is positive number");
		}
		else if(num<0)
		{
			System.out.println("Entered number is negative number");
		}
		else
		{
			System.out.println("Enter a valid number");
		}
	}
	
	

	public static void main(String[] args) {
		PositiveOrNegativeIfElse output = new PositiveOrNegativeIfElse();
		output.getInput();
		output.getOut();
		 

	}

}
