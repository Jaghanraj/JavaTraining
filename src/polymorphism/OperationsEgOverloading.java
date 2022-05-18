package polymorphism;

class Calculator 
{
	public void operation(int a,int b)
	{
		System.out.println("The addition value is :"+(a+b));
	}
	public void operation(double a,double b)
	{
		System.out.println("The multiplication value is :" +(a*b));
	}
	public void operation(int c,int a,int b)
	{
		System.out.println("The subtraction value is :" +(c = a-b));
	}
	public void operation(double c,double a,double b)
	{
		System.out.println("The division value is :" +(c = a/b));
	}
	public void operation(double a)
	{
		double c = Math.sqrt(a);
		System.out.println("The square root value is :" + c);
	}
}

public class OperationsEgOverloading {

	public static void main(String[] args) {
		Calculator operate = new Calculator();
		operate.operation(2,3);
		operate.operation(3.0,3.0);
		operate.operation(6,4,2);
		operate.operation(1.0, 6.0,3.0);
		operate.operation(3);
		 
	}

}
