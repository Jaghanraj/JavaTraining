package pack1;
class MobilePhone {
	String Brand,Camera;             
	void display(String Brand,String Camera) {
		System.out.println("Your mobile brand name is :" +Brand);
		System.out.println("Your pixel quality :" +Camera);
	}
}
 class Fan {
	    String Colour,Name;
	    void Spin(String Colour,String Name) {
	    	System.out.println("Your brand name is :" +Name);
	    	System.out.println("Your fan colour is :" +Colour);
	    }
 }
 class Employee {
	 String Name,Designtion;
	 int UserId;
	 void Working(String Name,String Designation,int UserId) {
		 System.out.println("Name of the employee :" +Name);
		 System.out.println("Designation of employee :" +Designation);
		 System.out.println("Emp no :" +UserId);
	 }
		 }
 class Student {
	 int RollNum;
	 String Name,Grade;
	 void study(String Name,String Grade,int RollNum) {
		 System.out.println("Name of the student" +Name);
		 System.out.println("Grade of the student" +Grade);
		 System.out.println("Student Id num:" +RollNum);
	 }
		 
		 
 }


public class OneMainClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone obj=new MobilePhone();
		obj.display("Samsung","16Mp");
		 
		Fan fan = new Fan();
		fan.Spin("Brown","Crompton");
		 
		Employee employee = new Employee();
		employee.Working("java","Trainee",2030);
		 
		Student student = new  Student();
		student.study("Jaghan","12th",001);
	}

}
