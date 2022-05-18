package polymorphism;
class MobilePhone
{
	public void Ram()
	{
		System.out.println("128 gb");
	}
	public void Display()
	{
		System.out.println("6.5 inches");
	}
	
}
class Samsung extends MobilePhone
{
	public void Ram()
	{
		System.out.println("256gb");
	}
	public void Display()
	{
		System.out.println("5.6 inches");
	}
}

public class MobileEgOverriding {

	public static void main(String[] args) {
		 Samsung mobile = new Samsung();
		 System.out.println("properties of samsung mobile\n");
		 mobile.Ram();
		 mobile.Display();
	}

}
