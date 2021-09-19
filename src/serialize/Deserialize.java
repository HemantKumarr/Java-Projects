package serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) {
//		reading a file
		try {
			FileInputStream file = new FileInputStream("file.txt");
			
//			creating an input object stream
			ObjectInputStream input = new ObjectInputStream(file);
			
//			deserialize an object stream
			Employee emp =  (Employee) input.readObject();
			System.out.println("Deserialization is completed");
			System.out.println("Emp id: " + emp.getId());
			System.out.println("Emp name: " + emp.getName());
			System.out.println("Emp salary: " + emp.getSal());
			System.out.println("Emp email: " + emp.getEmail());
			
//			clean up
			input.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
//		
	}

}
