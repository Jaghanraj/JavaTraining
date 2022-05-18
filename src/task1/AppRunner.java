package task1;

public class AppRunner {

	public static void main(String[] args) {

        System.out.println("Arithmetic operation");
        //To do operations
        SwitchExample example = new SwitchExample(100,20);
        example.operations();
      /*  example.getIntdetails();
        example.getStringdetails();
        example.operations();
        example.getIntdetails();
        example.getSecondInput();
        example.operations();
        example.getIntdetails();
        example.getThirdInput();
        example.operations();
        example.getIntdetails();
        example.getFourthInput();
        example.operations();
        example.getIntdetails();
        example.getFifthInput();
        example.operations(); */
        
       System.out.println("Constructor overloading");
        //constructor overloading
        ConstructorOverloading cons1=new ConstructorOverloading();
        ConstructorOverloading cons2=new ConstructorOverloading(2030,"jaghan");
        ConstructorOverloading cons3=new ConstructorOverloading(2030,"jaghan",5);
        ConstructorOverloading cons4=new ConstructorOverloading(2030,"jaghan",5,"Engineer");
        cons1.display();
        cons2.display();
        cons3.display();
        cons4.display();
        
        System.out.println("Count the character length");
		//To count the number of character
		CountCharacter count=new CountCharacter();
        count.countName();
        
}

}


