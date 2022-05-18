package taskString;

import java.util.Scanner;

public class ReverseStringRunner {
    
    public static void main (String args[])
    {
        ReverseString oReverseString = new ReverseString();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: "); 
        String str = scan.nextLine();
        scan.close();
        System.out.println("Original String :"+str);       
        System.out.println("Reverse String using Recursion :"+oReverseString.reverseRecursively(str));
        
    }

}
