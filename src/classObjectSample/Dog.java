package classObjectSample;

public class Dog {
	String color = "Black";
	String breed = "Dobber";
	public void show() {
		System.out.println("color :" +color);
		System.out.println("Breed :" +breed);
	}
public static void main(String[] args) {
	Dog dog = new Dog();
	dog.show();
 
		 

	}

}
