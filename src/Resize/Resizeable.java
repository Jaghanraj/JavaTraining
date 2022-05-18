package Resize;
interface Resizable
{
 void resize( double x);
}
class Rectangle1 implements Resizable
{
double height, width;
public Rectangle1(double w, double h) {
this.height = h;
this.width = w;
}
public void resize(double y)
{
this.width = width+y;
this.height = height+y;
}
public double getArea() {
return height * width;}
public double getPerimeter() {
return 2 * (height + width);}}
public class Resizeable { //Resizeableresult
        public static void main(String[] args) {
                Rectangle1 rec=new Rectangle1(3,2);
                System.out.println("Area of rectangle="+rec.getArea());
                System.out.println("perimeter of rectangle="+rec.getPerimeter());
                rec.resize(2);
                System.out.println("Area of rectangle="+rec.getArea());
                System.out.println("perimeter of rectangle="+rec.getPerimeter());
                }}
