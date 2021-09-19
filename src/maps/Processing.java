package maps;

import java.util.Map;

public class Processing 
{
	public void openAccount(Map<Long, basics> users, basics acc)
	{
		users.put(acc.accNo, acc);
	}
	
	public void showBalance(Map<Long, basics> users, long accNo1)
	{
		int flag = 0;
		for(Map.Entry<Long, basics> us : users.entrySet())
		{
			if (us.getValue().accNo == accNo1)
			{
				flag = 1;
				System.out.println("The account number is "+ us.getValue().accNo);
				System.out.println("The account name is "+ us.getValue().name);
				System.out.println("The account balance is "+ us.getValue().bal);
			}		
		}
		if(flag == 0)
		{
			System.out.println("Account not found");

		}
	}
	public void deposit(Map<Long, basics> users, long accNo2, int amount)
	{
		int flag = 0;
		for(Map.Entry<Long, basics> us : users.entrySet())
		{
			if (us.getValue().accNo == accNo2)
			{	
				flag = 1;
				us.getValue().bal+= amount;
				System.out.println("The account number is "+ us.getValue().accNo);
				System.out.println("The account name is "+ us.getValue().name);
				System.out.println("The account balance is "+ us.getValue().bal);
			}
		}
		if(flag == 0)
		{
			System.out.println("Account not found");

		}
	}
	public void displayAll(Map<Long, basics> users)
	{
		for(Map.Entry<Long, basics> us : users.entrySet())
		{
			System.out.println("------------------------");
			System.out.println("The account number is "+ us.getValue().accNo);
			System.out.println("The account name is "+ us.getValue().name);
			System.out.println("The account balance is "+ us.getValue().bal);
			System.out.println("The account email is "+ us.getValue().email);
		}
	}
}

