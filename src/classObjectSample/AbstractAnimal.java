package classObjectSample;
abstract class Animal {
	abstract void cats();
	abstract void dogs();
}
abstract class Cats extends Animal {
	void cats() {
		System.out.println("Cat Meo...");
	}
}
class Dogs extends Cats {
	void dogs() {
		System.out.println("Dogs Bark....");
	}
}
public class AbstractAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs animal = new Dogs();
		animal.cats();
		animal.dogs();
		

	}

}
