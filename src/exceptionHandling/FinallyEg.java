package exceptionHandling;

public class FinallyEg {

	public static void main(String[] args) {
		 try
		 {
			System.out.println("Inside try block"); 
			System.out.println(2/0);
			System.out.println("Also print this statement");
		 }
		 catch(Exception e)
		 {
			System.out.println("Inside catch block"); 
		 }
		 
		 finally
		 {
			 System.out.println("Inside finally block");
		 }
	}
}

