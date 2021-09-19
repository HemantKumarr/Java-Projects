package threads;

public class MainThreadRunnable implements Runnable {

	public static void main(String[] args) 
	{
		Runnable r1 = new MainThreadRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
	}
	public void run()
	{
		System.out.println("Main thread using runnable is running");
	}

}
