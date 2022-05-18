package taskAbstract20_04_2022;

public class OlympicsResultsDisplayer {

	public static void main(String[] args) {
		System.out.println("This is NeerajChopra");
		 Athelete oAthelete = new NeerajChopra();
		 oAthelete.eat();
		 oAthelete.sleep();
		 oAthelete.event();
		 oAthelete.accomplishment();
		 
		 System.out.println("\nThis is RaviKumar");
		 oAthelete = new RaviKumar();
		 oAthelete.eat();
		 oAthelete.sleep();
		 oAthelete.event();
		 oAthelete.accomplishment();
		 
		 System.out.println("\nThis is PvSindhu");
		 oAthelete = new PvSindhu();
		 oAthelete.eat();
		 oAthelete.sleep();
		 oAthelete.event();
		 oAthelete.accomplishment();	 	 
		  
	}

}
