package threads;

class Bank
{
	public int balance = 1000;
	synchronized void withdraw(int amount) {
		if(balance<amount)
		{
			System.out.println("Insufficient balance");
			try {
				wait();
			} catch (InterruptedException e) {
//				e.stackTraceTree();
			}
		}
		balance -= amount;
		System.out.println("Withdraw is completed and the new balance is " + balance);
	}
	
	synchronized void deposit(int deposit)
	{
		balance += deposit;
		System.out.println("Deposit is completed of amount " + deposit + " \n and the balance is " + balance);
		notify();
	}
	synchronized void showBalance()
	{
		System.out.println("The balance is " + balance);
	}
}
public class ThreadWithWait {

	public static void main(String[] args) 
	{
		Bank bank = new Bank();
		
		Thread t2 = new Thread( ()-> { 
			bank.deposit(3000);
		});

		Thread t3 = new Thread( ()-> { 
			bank.showBalance();
		});
		
		Thread t1 = new Thread( ()-> { 
			bank.withdraw(2000);
		});
		
//		t1.start();
		t2.start();
		t3.start();
		t1.start();

	}
}
