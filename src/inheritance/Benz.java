package inheritance;

public class Benz extends Maruti {

	public Benz() {
		System.out.println("This is Class Benz");
	}

	public void speed() {
		System.out.println("Maximum Speed : 100kmph ");
		super.speed();
	}

}