package threadClass;

class Thread1 extends Thread
{
	public Thread1()
	{
		super("ONE");
		start();
	}
	public void run()
	{
		for( int i=0; i<5; i++)
		{
			try {
				System.out.println((Thread.currentThread()).getName());
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
}
class Thread2 extends Thread
{
	public Thread2()
	{
		super("TWO");
		start();
	}
	public void run()
	{
		for( int i=0; i<5; i++)
		{
			try {
				System.out.println((Thread.currentThread()).getName());
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
}
class Thread3 extends Thread
{
	public Thread3()
	{
		super("THREE");
		start();
	}
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			try {
			System.out.println((Thread.currentThread()).getName());
			Thread.sleep(1000);
		    }catch(Exception e) {}
	}
}

public class MultiThreadEg1 {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		 

	}

}
}
