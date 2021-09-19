package exceptions;

import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) {
		
		try {
			ageValidator(20);
			ageValidator(3);
			ageValidator(38);	// not executed since previous line itself throws exception
			
		} catch (Exception e) 
		{
			System.out.println("Exception occured "+ e.getClass());		
		}
	}

		private static void ageValidator(int age) throws IOException  {
		
		if(age > 18)
		{
			System.out.println("Valid age");
		}
		else
			throw new IOException("Not a valid age"); //allows the user to generate Runtime Exception
	}

}
