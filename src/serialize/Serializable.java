package serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializable {

	public static void main(String[] args) 
	{
		Employee emp = new Employee(1001,"John",34546.89,"john@gmail.com"); 
		
		try {
//			creating file output stream
			FileOutputStream file = new FileOutputStream("file.txt");
			
//			creating an object stream
			ObjectOutputStream obj = new ObjectOutputStream(file);
			
//			method to serialize the object
			obj.writeObject(emp);
			System.out.println("serialization is completed");
			
//			clean up
			obj.close();
			file.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
}

}
