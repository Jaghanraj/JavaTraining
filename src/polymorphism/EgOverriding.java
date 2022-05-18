package polymorphism;

class Vehicle {
	public void space() {
		System.out.println(0);
	}
	public void speed()
	{
		System.out.println(0);
	}
	public void colour()
	{
		System.out.println("white");
	}
}
class bmw extends Vehicle
{
	public void space() 
	{
		System.out.println("Seat capacity is 4");
	}
	public void speed()
	{
		System.out.println("Speed is 1550Rpm");
	}
	public void colour()
	{
		System.out.println("Colour of the car : Blue");
	}
}
class Audi extends Vehicle
{
	public void space()
	{
		System.out.println("Seat capacity is 2");
	}
	public void speed()
	{
		System.out.println("Speed of the car is 1500cc");
	}
	public void colour()
	{
		System.out.println("Colour of the car : Red");
	}
}

public class EgOverriding {

	public static void main(String[] args) {
		System.out.println("Features of BMW\n");
		bmw car1 = new bmw();
		car1.space();
		car1.colour();
		car1.speed();
		System.out.println("\nFeatures of  Audi\n");
		Audi car2 = new Audi();
		car2.space();
		car2.colour();
		car2.speed();
	}

}
