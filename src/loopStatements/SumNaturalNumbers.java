package loopStatements;
import java.util.Scanner;

public class SumNaturalNumbers {
	Integer i,input,sum=0;
	public void getinput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		input = scan.nextInt();
		scan.close();
	}
	public void num()
	{
		for(i=1; i<=input; i++)
		{
			sum = sum+i;
		}
		System.out.println( "Sum of natural numbers :"+sum);
	}

	public static void main(String[] args) {
		SumNaturalNumbers numbers = new SumNaturalNumbers();
		numbers.getinput();
		numbers.num();
		 

	}

}
