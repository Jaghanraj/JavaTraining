package abstractInterfaceEg;

public class AnimalCalling extends Animal implements Animal1 {

	
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating..");
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Sleeping...");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Brown");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Jumping...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalCalling animal = new AnimalCalling();
		animal.eat();
		animal.jump();
		animal.run();
		animal.sleep();
		animal.color();

	}
}