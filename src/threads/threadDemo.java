package threads;

public class threadDemo 
{
	public static void main(String[] args) 
	{
//		Creating a thread object
		Sam t1 = new Sam();
		Bob t2 = new Bob();
		Ali t3 = new Ali();
		
//		Starting a thread object
		t1.start();
		t2.start();
		t3.start();
		
//		Executed by  main thread
		for (int i=0; i<4; i++)
		{
			System.out.println("Main " + i + " is running");
		}
	}
}

class Sam extends Thread
{
	public void run() 
	{
		for (int i=0; i<4; i++)
		{
		System.out.println("Sam " + i +" is running");
		}
	}
}

class Bob extends Thread
{
	public void run() 
	{
		for (int i=0; i<4; i++)
		{
		System.out.println("Bob " + i +" is running");
		}
	}
}
class Ali extends Thread
{
	public void run() 
	{
		for (int i=0; i<4; i++)
		{
		System.out.println("Ali " + i +" is running");
		}
	}
}
