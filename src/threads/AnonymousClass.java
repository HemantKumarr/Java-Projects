package threads;

public class AnonymousClass {

	public static void main(String[] args) 
	{
		Runnable r1 = new Runnable (){
			
			public void run() 
			{
				for (int i=0; i<4; i++)
				{
				System.out.println("Thread 1 iteration " + i +" is running");
				}
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();

		Runnable r2 = new Runnable (){
			@Override
			public void run() 
			{
				for (int i=0; i<4; i++)
				{
				System.out.println("Thread 2 iteration " + i +" is running");
				}
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}
}