package classObjectSample;

abstract class AbstractShape{
	   int l = 2;
	   int b = 4;
	   public void display(){
	     System.out.println("This is calculate method");
	   }
	   abstract public void calculateArea();
	}
class calculate extends AbstractShape {
	public void calculateArea() {
		int area = l*b;
		System.out.println("Area of the reactangle =" +area);
	}
}

	class Rectangle1 extends calculate {
	   public static void main(String args[]){
	      calculate obj = new calculate();
	      obj.display();
	      obj.calculateArea();
	      
	  }
	 
	}
