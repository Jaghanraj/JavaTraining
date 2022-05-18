package taskString;

import java.util.Scanner;

public class StringPalindromeRunner {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input String :");
        String str = scan.nextLine();
        scan.close();
        
        StringPalindrome oStringPalindrom = new StringPalindrome();
        System.out.println("Given String is Palindrom : "+oStringPalindrom.checkPalindrom(str));
        

    }

}