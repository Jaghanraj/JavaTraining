package loopStatements;
import java.util.Scanner;

class Task123 
{
	long input,sum=0,count;
	int i;
	String name;
	Scanner input1 = new Scanner(System.in);
	public void inputTask()
	{
		System.out.println("Enter the number to count digits and sum digits");
		input = input1.nextInt();
	}
	public void inputTask2() 
	{
		System.out.println("Enter the string to count vowels");
		 name = input1.next();
	}
	 public void countsdetails() {
         for(count=0;input!=0;count++) {
        	 sum = sum + input % 10;
                 input=input/10;
         }
         System.out.println("Count of Digits:"+count);
         System.out.println("Sum of digits :" +sum);
 }
	public void countVowels()	
	{ 
		int count =0;
		for(i=0;i<name.length();i++)		{
			 if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
             {
                     System.out.println("position string contains "+ name.charAt(i) +" at the index "+i);
                      count++;      
             } 
		}System.out.println("Vowels present in the name :"+count);
	}
	public static void main(String[] args) {
		 Task123 sum = new Task123();
		 sum.inputTask();
		 sum.countsdetails();
		 sum.inputTask2();
		 sum.countVowels();
	}

}
