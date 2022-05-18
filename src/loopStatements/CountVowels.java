package loopStatements;
import java.util.Scanner;

public class CountVowels {
	 String name;
     int count=0;
     public void input() 
     {
    	 Scanner scan = new Scanner(System.in);
    	 System.out.println("Ener the string");
    	 name=scan.nextLine();
    	 scan.close();
     }
     public void vowel()
     {
    	  for(int i=0;i<name.length();i++) {
              if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
              {
                      System.out.println("position string contains "+ name.charAt(i) +" at the index "+i);
                       count++;
                      
              }
              }
      System.out.println("Entered name is :" +name);
      System.out.println("No of Vowels="+count);
    
     }

    public static void main(String[] args) {
             
          CountVowels count = new CountVowels();
          count.input();
          count.vowel();
           }
}
