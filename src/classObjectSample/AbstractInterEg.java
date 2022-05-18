package classObjectSample;
abstract class pen {
	abstract void write();
	abstract void refill();
}
class fountainPen extends pen {
	public void write() {
		System.out.println("Writing..");
	}
	public void refill() {
		System.out.println("Refilling...");
	}
	public void changeNib() {
		System.out.println("Changing Nib...");
	}
}
interface BasicAnimal {
	void eat();
	void sleep();
}
class monkey    {
	void jump() {
		System.out.println("Monkey is Jumping...");
	}
	void bite() {
		System.out.println("Monkey is Biteing..");
	}
	
}
class human extends monkey  implements  BasicAnimal {
	public void eat() {
		System.out.println("Man is eating...");
	}
	public void sleep() {
		System.out.println("Man is sleeping...");
	}
}
public class AbstractInterEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fountainPen pen = new fountainPen();
		pen.write();
		pen.refill();
		pen.changeNib();
		
		human action = new human();
		action.jump();
		action.bite();
		action.sleep();
		action.eat();
		

	}

}
