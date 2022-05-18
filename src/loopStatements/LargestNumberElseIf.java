package loopStatements;
import java.util.Scanner;
public class LargestNumberElseIf {
	int num1,num2;
	public void getinput()
	{
		Scanner scan1 = new  Scanner(System.in);
		System.out.println("Enter the first number");
		num1 = scan1.nextInt();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the second number");
		num2 = scan2.nextInt();
		scan1.close();
		scan2.close();
	}
	public void getoutput()
	{
		if(num1 > num2)
		{
			System.out.println(num1 +" :Is the biggest number");
		}
		else if(num1 < num2)
		{
			System.out.println(num2 +" :Is the biggest number");
		}
		else
		{
			System.out.println("Enter the valid number");
		}
	}

	public static void main(String[] args) {
		LargestNumberElseIf large = new LargestNumberElseIf();
		large.getinput();
		large.getoutput();
		 

	}

}
