package access1;

public class MainPerson {
	public void msg()
	{
		System.out.println("Anyone can use my pen - public");
	}
	protected void protect()
	{
		System.out.println("My bike - protected");
	}
	void defaul()
	{
		System.out.println("Tv inside my home - default");
	}
	private void personal()
	{
		System.out.println("My mobile password - private");
	}

	public static void main(String[] args) {
		
		 MainPerson obj = new MainPerson();
		 obj.msg();
		 obj.protect();
		 obj.defaul();
		 obj.personal();

	}

}
