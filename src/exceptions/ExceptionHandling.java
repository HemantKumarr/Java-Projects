package exceptions;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
		division(100);
		division(00);
		division(50);

		StringConverter("365");
		StringConverter(null);
		StringConverter("456.00");
		
		StringLength("world");
		StringLength(null);
		StringLength("happy");
		
		multiTask("4567", 20);	
		multiTask("105485", 0);		
		multiTask(null,100);		

	}
	
	private static void division(int divisor) {
		try {
			int number = 1000;
			int div = number/divisor;
			System.out.println("The division is "+ div);
			
		} catch (Exception e) {
			System.out.println("Exception occured "+ e.getClass());
		}
	}

	private static void StringConverter(String str) {
		try {
			int number = Integer.parseInt(str);
			System.out.println("The number is " + number);
		} catch (NumberFormatException e) {
			System.out.println("Exception occured "+ e.getClass());
		}
	} 
	
	private static void StringLength(String string) {
		try {
			int len = string.length();
			System.out.println("The length of string is "+ len);
		} catch (NullPointerException e) {
			System.out.println("Exception occured "+ e.getClass());
		}
	}
	
	private static void multiTask(String str, int divisor)
	{
		System.out.println("-------------------------------");
		try {
			
			int number1 = 1000;
			int div = number1/divisor;
			System.out.println("The division is "+ div);
			
			int number2 = Integer.parseInt(str);
			System.out.println("The number is " + number2);
			
			int len = str.length();
			System.out.println("The length of string is "+ len);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occured "+ e.getClass());
		}
		catch (NumberFormatException e) {
			System.out.println("Number Format Exception occured "+ e.getClass());
		}
		catch (NullPointerException e) {
			System.out.println("Null POinter Exception occured "+ e.getClass());
		}
	}
}
