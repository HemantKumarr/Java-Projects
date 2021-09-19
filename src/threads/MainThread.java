package threads;

public class MainThread extends Thread {

	public static void main(String[] args) 
	{
//		Creating a thread object
		MainThread t1 = new MainThread();
		t1.start();
	}
	public void run()
	{
		System.out.println("Main thread is running");
	}

}
