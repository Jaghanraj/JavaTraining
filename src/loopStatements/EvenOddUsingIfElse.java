package loopStatements;
import java.util.Scanner;

public class EvenOddUsingIfElse {
	int remainder,number;
	public void input()
	{
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number to find odd or even");
		number = num.nextInt();
		num.close();
	}
	public void find()
	{
		remainder = number % 2;
		if(remainder == 0)
		{
			System.out.println(number +"Entered number is even");
		}
		else
		{
			System.out.println("Entered number is odd");
		}
	}

	public static void main(String[] args) {
		 EvenOddUsingIfElse output = new EvenOddUsingIfElse();
		 output.input();
		 output.find();

	}

}
