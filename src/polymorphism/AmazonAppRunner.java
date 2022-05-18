package polymorphism;

public class AmazonAppRunner {

	public static void main(String[] args) {
		System.out.println("Buying a mobilePhone from amazon \n");
		 MobilePhones amazon1 = new MobilePhones();
		 amazon1.AddProduct();
		 amazon1.BuyLater();
		 amazon1.IncreaseProductCount(); 
		 amazon1.ProceedToBuy();
		 System.out.println("\nBuying accessories form amazon \n");
		 Accessories amazon2 = new Accessories();
		 amazon2.AddProduct();
		 amazon2.BuyLater();
		 amazon2.colour();
		 amazon2.ProceedToBuy();
		 
		 System.out.println("\nAdding products to cart by mehtod overriding\n");
		 amazon2.ProductNoCount(1);
		 amazon2.ProductNoCount(1, 1);
		 amazon2.ProductNoCount(1, 1, 1);

	}

}
