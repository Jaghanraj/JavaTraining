package polymorphism;

public abstract class AmazonCart 
{	
	public void AddProduct()
	{
		System.out.println("Iphone 13 pro");
	}
	public abstract void BuyLater();	 
	public abstract void DeleteProduct();	 
	public abstract void ProceedToBuy();	 
	public abstract void IncreaseProductCount();	 
	public abstract void colour();
	 
}
class MobilePhones extends AmazonCart
{
	 
	public void BuyLater()
	{
		System.out.println("Add to my cart");
	}
	public void ProceedToBuy()
	{
		System.out.println("Enter the address to be delivered");
	}
	public void IncreaseProductCount()
	{
		System.out.println("Count of the product is one");
	}
	@Override
	public void DeleteProduct() {
		 System.out.println("Delete the product added to cart");
		
	}
	@Override
	public void colour() {
		 System.out.println("Colour of the moile is : Blue");
		
	}
}
class Accessories extends AmazonCart
{
	public void ProductNoCount(int a)
	{
		System.out.println(" Add to cart :" +a +" Item added");
	}
	public void ProductNoCount(int a,int b)
	{ 
		System.out.println(" Add to cart :" +(a+b) +" Items added"); 
	}
	public void ProductNoCount(int a,int b,int c)
	{
		int d = a+b+c;
		System.out.println(" Add to cart :" +d+ " Items added");
	}
	public void AddProduct()
	{
		System.out.println("Backcase for Apple Iphone 13");
	}
	 	public void BuyLater()
	{
		System.out.println("Add to my cart");
	}
	public void ProceedToBuy()
	{
		System.out.println("Enter the address to be delevired");
	}
	@Override
	public void DeleteProduct() {
		 System.out.println("Delete the backcase in the cart");
		
	}
	@Override
	public void IncreaseProductCount() {
		 System.out.println("To increse the number of cases");
		
	}
	@Override
	public void colour() {
		 System.out.println("Select the case colour");
		
	}
}

