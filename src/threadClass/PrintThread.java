package threadClass;

public class PrintThread {

	public static void main(String[] args) {
		 Thread t = Thread.currentThread();
		 System.out.println(t.getName());
		 t.setName("NewThread");
		 System.out.println(t.getName());

	}

}
