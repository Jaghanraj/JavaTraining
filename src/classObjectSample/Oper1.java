package classObjectSample;

public class Oper1 {
 
	public static void ques1() {
		int a = 5;
		int b = 8;
		int c = 6;
		int d;
		d =(-a+b*c);
		System.out.println("The output of ques1 is:" +d);
	}
	public static void ques2() {
		int a = 55;
		int b = 9;
		float c;
		c = (a+b)%b;
		System.out.println("The output of ques2 is:" +c);
	}
	public static void ques3() {
		int a = 20;
		int b = 3;
		int c = 5;
		int d = 8;
		int e;
		e =(a+-b*c/d);
		System.out.println("The output of ques3 is:" +e);
	}
	public static void ques4() {
		int a = 5;
		int b = 15;
		int c = 3;
		int d = 2;
		int e = 8;
		int f;
		f =(a+b/c*d-e%c);
		System.out.println("The output of ques4 is:" +f);
	}
	public class Runner{

		public static void main(String[] args) {
			
			OperatorDemo.ques1();
			OperatorDemo.ques2();
			OperatorDemo.ques3();
			OperatorDemo.ques4();
	
		

	}
	}

	}

