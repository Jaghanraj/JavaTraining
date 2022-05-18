package loopStatements;
import java.util.Scanner;

public class CalculatePowerValue {
	Integer base,power,i,result=1;
	public void getinput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base number");
		base = scan.nextInt();
		System.out.println("Enter the power number");
		power = scan.nextInt();
		scan.close();
	}
	public void powerCalculation()
	{
		for(i=1; i<=power;i++)
		{
			result =result*base;
		}
		System.out.println("power value of :"+ result);
	}

	public static void main(String[] args) {
		CalculatePowerValue power = new CalculatePowerValue();
		power.getinput();
		power.powerCalculation();
		 

	}

}
