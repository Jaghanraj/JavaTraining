package inheritance;

class InheritP {
	private String show;

	public String getShow() {
		return show;
	}

	public void setShow(String show) {
		this.show = show;
	}
}
class InheritC extends Inherit1 {
	void display() {
		System.out.println("This is child class");
	}

	public void setShow(String string) {
		// TODO Auto-generated method stub
		System.out.println();
		
	}
	
	
}

public class InheritanceEg2 {

	public static void main(String[] args) {
		 InheritC inherit = new InheritC();
		 inherit.setShow("This is child class");
		 inherit.display();
		 
		 

	}

}

