package abstractInterfaceEg;

public class Benz extends Car implements UpcommingProjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Benz();
		car.CompanyValut();
		car.employee();
		car.EngineSecret();
		Benz benz = new Benz();
		benz.Machine();
		 

	}

	@Override
	public void EngineSecret() {
		// TODO Auto-generated method stub
		System.out.println("Benz engine secret");
		
	}

	@Override
	public void CompanyValut() {
		// TODO Auto-generated method stub
		System.out.println("Benz company valut");
		
	}

	@Override
	public void Machine() {
		// TODO Auto-generated method stub
		System.out.println("Car is a machine");
		
	}

}
