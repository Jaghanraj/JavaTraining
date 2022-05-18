package classObjectSample;
 abstract class Shape{
	public abstract void getArea();
	public abstract void getPerimeter();
}
 class Rectangle extends Shape {
	 double width , height;
	 public Rectangle(double width,double height) {
		 this.width=width;
		 this.height=height;
		 }
	public void getArea()
	 {
		 System.out.println("Area of Rectangle :" + (width*height));
	 }
	 public void getPerimeter()
	 {
		 System.out.println("Perimeter of Rectangle :" + (2*(width + height)));
	 }
 }
	 class Triangle extends Shape {
		 double width , height;
		 public Triangle(double width,double height) {
			 this.width=width;
			 this.height=height;
			 }
		 
		 public void getArea()
		 {
			 System.out.println("Area of triangle is :" +(width*height)/2);
		 }
		 public void getPerimeter()
		 {
			 System.out.println("Perimete of triangle :"+(Math.sqrt((width*width)+(4*height*height))+width));
		 }
	 }
	 
class TestShape {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(2,4);
		rectangle.getArea();
		rectangle.getPerimeter();
		
		Triangle triangle = new Triangle(2,3);
		triangle.getArea();
		triangle.getPerimeter();
	}
		}


