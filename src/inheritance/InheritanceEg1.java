package inheritance;

class Inherit1 {
	void show() {
		System.out.println("This is parent class");
	}
}
class Inherit2 extends Inherit1 {
	void display() {
		System.out.println("This is child class");
	}
}

public class InheritanceEg1 {

	public static void main(String[] args) {
		Inherit2 inherit = new Inherit2();
		inherit.show();
		inherit.display();
		 

	}

}
