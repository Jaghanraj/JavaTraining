package loopStatements;
import java.util.Scanner;

public class Loansanction {
	int age;
	long salary,loanAmount;
	public void getinput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age");
		age = scan.nextInt();
		System.out.println("Enter the salary");
		salary = scan.nextLong();
		scan.close();
		
	}
	public void loanrunner() 
	{
		if ((age > 20 ) && (salary > 25000))
		{
		 
			System.out.println("You are eligible for Loan");
		}
		else {
			System.out.println("Not valid for the loan");
		}
	}

        public static void main(String[] args) {
        	Loansanction loan = new Loansanction();
        	loan.getinput();
        	loan.loanrunner();
        }
}