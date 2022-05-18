package classObjectSample;

public class Circle {
	float radius;
	public Circle(float radius) {
		this.radius = radius;
	}
public void getDiameter() {
	System.out.println("Diameter of a circle :"+" "+(2 * radius));
}
	public static void main(String[] args) {
		 Circle circle = new Circle(3.5f);
		 circle.getDiameter();

	}

}
