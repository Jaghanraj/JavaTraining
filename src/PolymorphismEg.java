class Student{
	void studentDetails(int studentMark, int StudentId) {
		System.out.println("studentMark :" +studentMark);
		System.out.println("Student Id :" +StudentId);
	}
	void StudentDetails(String Name,String subName) {
		System.out.println("Student name :" +Name);
		System.out.println("Subject name :" +subName);
	}
}

public class PolymorphismEg {

	public static void main(String[] args) {
		Student student = new Student();
		student.studentDetails(20, 001);
		student.StudentDetails("jaghan", "Maths");

	}

}
