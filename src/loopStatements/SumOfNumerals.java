package loopStatements;

import java.util.Scanner;
public class SumOfNumerals{ 
	public void getinput()
  {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        long n = input.nextLong();
        System.out.println("The sum of the digits is: " + sumDigits(n));
        input.close();

    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
    	SumOfNumerals numerals = new SumOfNumerals();
    	numerals.getinput();
    	
    	
    }
}
