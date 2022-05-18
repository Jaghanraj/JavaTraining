package task14_04_2022;

public class ArmstrongNumber {
    int number1 = 0, number2 =500;
    
    public void operation()
    {
        for( int iterate = number1; iterate<number2; iterate++)
        {
            int check, remainder, sum = 0;
            check = iterate;
            
            while ( check != 0)
            {
                remainder = check % 10; //1
                sum = sum + (remainder * remainder * remainder); //1
                check = check / 10;
            }
            if (sum == iterate)
            {
                System.out.println(iterate + " is an Armstrong number");
            }
        }
    }
}
    
   