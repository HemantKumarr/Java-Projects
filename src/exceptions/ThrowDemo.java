package exceptions;

public class ThrowDemo {

	public static void main(String[] args) {
		
		try {
			StringConverter("454545");
			StringConverter("hello");
			
		} catch (Exception e) 
		{
			System.out.println("Exception occured "+ e.getClass());		
		}
		ageValidator(2);
		ageValidator(38);
	}

	private static void StringConverter(String str) {
		try {
		int number = Integer.parseInt(str);
		System.out.println("The number is " + number);
		}
		catch (Exception e)
		{
			System.out.println("Exception occured "+ e.getClass());		
		}
	}

	private static void ageValidator(int age) {
		
		if(age > 18)
		{
			System.out.println("Valid age");
		}
		else
			throw new RuntimeException("Not a valid age"); //allows the user to generate Runtime Exception
	}

}
