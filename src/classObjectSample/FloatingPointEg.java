package classObjectSample;

public class FloatingPointEg {

    
	  public static void main(String[] args)
	    {
		  long input =25;
	        System.out.println("Input value: " +" "+input);
	        

	        if (input > 0)
	        {
	            if (input < 1)
	            {
	                System.out.println("\nPositive small number");
	            }
	            else if (input > 1000000)
	            {
	                System.out.println("\nPositive large number");
	            }
	            else
	            {
	                System.out.println("\nPositive number");
	            }
	        }
	        else if (input < 0)
	        {
	            if ( Math.abs (input) < 1)
	            {
	                System.out.println("\nNegative small number");
	            }
	            else if (Math.abs (input) > 1000000)
	            {
	                System.out.println("\nNegative large number");
	            }
	            else
	            {
	                System.out.println("\nNegative number");
	            }
	        }
	        else
	        {
	            System.out.println("\nZero");
	        }
	    }
	}
