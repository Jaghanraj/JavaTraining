package task14_04_2022;

import java.util.Scanner;

public class ReverseNumber{
    int number,reverseNumber = 0,remainder;
    
     public void getinput()
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the input number : ");
        number = scan.nextInt();
        scan.close();
    }
    
    public void operation()
    {
        while(number != 0)
        {
            remainder = number % 10; 
            reverseNumber = reverseNumber * 10 + remainder; 
            number = number / 10;    
        }
        System.out.println("Reverse of input number : "+reverseNumber);
    }
    

    public static void main(String[] args) {
        ReverseNumber oReverseExample = new ReverseNumber();
         oReverseExample.getinput();
        oReverseExample.operation();

    }

}
