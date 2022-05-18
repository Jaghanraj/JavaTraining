package task1;

import java.util.Scanner;
public class CountCharacter {
        String name;
        int count=0;
        CountCharacter()
        {
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter the name to count character");
                name=scan.nextLine();
                scan.close();
        }
        public void countName()
        {
                /*for(int charIndex=0;charIndex<name.length();charIndex++)
                {
                        count++;
                }*/
               System.out.println("Number of characters in name is "+name.length());
        }
}

       /* public static void main(String[] args) {
                CountCharacter count=new CountCharacter();
                count.countName();
        }

} */