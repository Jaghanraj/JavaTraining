package classObjectSample;

public class Employee {
	int ID;
	String Name;
	String Department;
	double Salary;
	Employee(int ID,String Name,String Department,double Salary) {
		this.ID = ID;
		this.Name = Name;
		this.Department = Department;
		this.Salary = Salary;
	}
		
		void assign() {
			System.out.println("Employee ID :" +ID);
			System.out.println("Employee Name :" +Name);
			System.out.println("Employee Department :" +Department);
			System.out.println("Employee Salery :" +Salary);
		}
		 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Employee employee = new Employee(2029,"Jaghan","Software engineer",22.393d);
            employee.assign();
	}

}
