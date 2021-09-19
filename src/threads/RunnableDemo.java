package threads;

public class RunnableDemo 
{
	public static void main(String[] args) 
	{
		Runnable r1 = new Bob1();
		Thread t1 = new Thread(r1);
		t1.start();
		
		Ali1 r2 = new Ali1();
		Thread t2 = new Thread(r2);
		t2.start();
		
		Runnable r3 = new Sam1();
		Thread t3 = new Thread(r3);
		t3.start();
		
//		Executed by  main thread
		for (int i=0; i<4; i++)
		{
			System.out.println("Main " + i +" is running");
		}
	}
}

class Bob1 implements Runnable
{
	public void run() 
	{
		for (int i=0; i<4; i++)
		{
		System.out.println("Bob " + i +" is running");
		}
	}
}

class Ali1 implements Runnable
{
	public void run() 
	{
		for (int i=0; i<4; i++)
		{
		System.out.println("Ali " + i +" is running");
		}
	}
}

class Sam1 implements Runnable
{
	public void run() 
	{
		for (int i=0; i<4; i++)
		{
		System.out.println("Sam " + i +" is running");
		}
	}
}