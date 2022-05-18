package classObjectSample;

public class TestStudent3 {
	int id;
	String name;


	public static void main(String[] args) {
		 TestStudent3 s3=new TestStudent3();
		 TestStudent3 s4=new TestStudent3();
		 s3.id=001;
		 s3.name="Jaghan";
		 s4.id=002;
		 s4.name="java";
		 System.out.println(s3.id+" "+s3.name );
		 
		 System.out.println(s4.id+" "+s4.name);
	}

}
