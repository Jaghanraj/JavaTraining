package loopStatements;

import java.util.Scanner;

public class CountDigits {
        long input;
        int count;
        public void getinput() {
                        Scanner in = new Scanner(System.in);
                        System.out.println("Enter the input:");
                        input=in.nextLong();
                        in.close();
                      
        }
        
        public void countsdetails() {
                for(count=0;input!=0;count++) {
                        input=input/10;
                }
                System.out.println("Count of Digits:"+count);
        }

        public static void main(String[] args) {
                CountDigits digits=new CountDigits();
                digits.getinput();
                digits.countsdetails();
        }

}
