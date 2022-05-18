package classObjectSample;

public class AbstractMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShivaPhone phone = new  ShivaPhone();
		phone.call();
		phone.whatsapp();
		phone.instagram();
		phone.facebook();

	}

}
abstract class SubbuPhone {
	public void call() {
		System.out.println("Calling...");
	}
	public abstract void whatsapp();
	public abstract void instagram();
	public abstract void facebook();
}
abstract class JaghanPhone extends SubbuPhone {
	public void whatsapp() {
		System.out.println("Whatsapp downloaded");
	}
	public void instagram() {
		System.out.println("Instagram downloaded");
	}
	
}
class ShivaPhone extends JaghanPhone {
	public void facebook() {
		System.out.println("Facebook downloaded");
	}
}