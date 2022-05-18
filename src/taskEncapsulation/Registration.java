package taskEncapsulation;
import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student oStudent = new Student();		
		System.out.println("AdmissionId :");
		oStudent.setAdmissionId(scan.nextInt());
		System.out.println("Phone NUmber :");
		oStudent.setPhoneNumber(scan.nextLong());
		System.out.println("Name :");
		oStudent.setName(scan.next());
		System.out.println("eMail :");
		oStudent.seteMail(scan.next());
		scan.close();
		 
		 
		 System.out.println("Admin Id :" +oStudent.getAdmissionId());
		 System.out.println("Name :" +oStudent.getName());
		 System.out.println("PhoneNumber :" +oStudent.getPhoneNumber());		 		
		 System.out.println("eMail Id :" +oStudent.geteMail());		 
	}

}
