package classObjectSample;

abstract class AbstractBike {
	public void move() {
		System.out.println("Bike is Running...");
	}
	 
	  void slow() {
		System.out.println("Slow down...");
	}
	  public abstract void speed();
}
class Honda extends AbstractBike {
	public void speed() {
		System.out.println("Honda is the brand name");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Honda bike = new Honda();
		bike.move();
		bike.slow();
		bike.speed();

	}

}
