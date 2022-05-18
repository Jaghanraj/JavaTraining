package threadClass;

class FirstThread extends Thread
{
	FirstThread()
	{
		setName("ONE");
		start();
	}
	public void Run()
	{
		for(int i = 0; i<5 ; i++)
		{
			try {
				System.out.println((Thread.currentThread()).getName());
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
}
public class ExtendsThread {

	public static void main(String[] args) {
		 FirstThread thread1 = new FirstThread();
		 for(int i =0; i<5 ; i++)
		 {
			 try {
				 System.out.println((Thread.currentThread()).getName());
				 Thread.sleep(1000);				  
			 }catch(Exception e) {}
		 }

	}

}
