package loopStatements;
import java.util.Scanner;
public class WhileMultiply {
	Integer i,input;
	public void getinput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to print tables");
		input = scan.nextInt();
		scan.close();
	}
	public void multiply() 
	{
		i=1;
		while(i<=10)
		{
			System.out.println(i +"X"+input + "=" +(i*input));
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileMultiply mul = new WhileMultiply();
		mul.getinput();
		mul.multiply();

	}

}
