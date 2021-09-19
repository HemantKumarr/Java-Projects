package threads;

public class ThreadLambdaExpr 
{
	public static void main(String[] args) 
	{		
		Thread t1 = new Thread( () -> {
				for (int i=0; i<4; i++)
				{
				System.out.println("Thread 1 iteration " + i +" is running");
				}
			});
		t1.start();

		Thread t2 = new Thread( () -> {
					for (int i=0; i<4; i++)
					{
					System.out.println("Thread 2 iteration " + i +" is running");
					}
				});
		t2.start();
	}
}