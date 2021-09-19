package maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.System;
public class BankDisplay 
{
//	try with code for using same variable accNo in multiple switch cases
//	exiting the console application
	public static void main(String[] args) 
	{
		basics acc1 = new basics(10001,"Henry",3434.7, "henry@gmail.com");
		basics acc2 = new basics(10002,"Ali",22434.7, "ali@gmail.com");
		basics acc3 = new basics(10003,"Sam",734.7, "sam@gmail.com");
		basics acc4 = new basics(10004,"Anu",3434.7, "anu@gmail.com");
		
		Map<Long, basics> users = new LinkedHashMap<Long, basics>();
		boolean status = true;
		Processing pr = new Processing();

		users.put(10001L, acc1);
		users.put(10002L, acc2);
		users.put(10003L, acc3);
		users.put(10004L, acc4);
		while(status)
		{
			System.out.println("Welcome to the bank");
			System.out.println("1) Open account \n 2) Show balance \n 3) Deposit \n 4) Exit \n 5) Print all accounts");
			
			System.out.println("Enter your choice");
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
		
			switch(choice)
			{
			case 1:
				System.out.println("Enter your details");
				System.out.println("Enter your accNo");
				long accNo = input.nextLong();
				System.out.println("Enter your name");
				String name = input.next();
				System.out.println("Enter your amount");
				double balance = input.nextDouble();
				System.out.println("Enter your email");
				String email = input.next();
				
				pr.openAccount(users, new basics(accNo, name, balance, email));
				break;
			
			case 2:
				System.out.println("Enter your account number");
				long accno1 = input.nextLong();
				pr.showBalance(users, accno1);
				break;
				
			case 3 :
				System.out.println("Enter your account number");
				long accNo2 = input.nextLong();
				System.out.println("Enter the amount to be deposited");
				int amount = input.nextInt();
				pr.deposit(users, accNo2, amount);
				break;
				
			case 4:
				System.out.println("Closing");
				status = false;
				System.exit(0);
				
			case 5:
				System.out.println("Dispalying all the account details");
				pr.displayAll(users);
				break;
			
			default:
				break;
			}
			input.close();
		}
	}
}
