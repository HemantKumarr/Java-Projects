package threads;

class Counter
{
	int count = 0;
	 public synchronized void increaseCount() //Thread safe, only one thread can execute it at a time
	 {
		 count+=1;
	 }
	 
	 public void decreaseCount()
	 {
		 count-=1;
	 }
}
public class ThreadSafety 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		Counter counter = new Counter();
		Thread t1 = new Thread( () -> {
				for (int i=0; i<1000; i++)
				{
					counter.increaseCount();
				}
			});

		Thread t2 = new Thread( () -> {
					for (int i=0; i<1000; i++)
					{
						counter.increaseCount();
					}
				});
		t1.start();
		t2.start();
		t1.join();  // join function make sure that main thread is executed last
		t2.join();
		System.out.println("The count is "+ counter.count);
	}
}