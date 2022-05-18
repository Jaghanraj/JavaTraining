package factoryDesignPatternEg;
 
public class FactoryMain {

	public static void main(String[] args) {
	     OperatingSystemFactory oFactory = new OperatingSystemFactory();
		 OS osType = oFactory.getInstance( "Open");
		 osType.spec();	  

	}

}
