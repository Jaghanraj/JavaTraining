package exceptionHandling;

public class SingleTryCatchEg {

	public static void main(String[] args) {
		 try {
			 int number1 = 2;
			 int number2 = 4;
			 int result=number2/number1;
			 System.out.println(result);
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("Can't divide by zero");
		 } 
		 catch(NullPointerException e)
		 {
			 System.out.println("This is due to null pointer exception");
		 } 
		 catch(Exception e)               //always parent exception must be in the last
		 {
			// e.printStackTrace();  To find what exception is been throwed
			System.out.println("Don't try to divide by zero"); 
		 }

	}

}
