package collections;
import java.util.ArrayList;
//import java.util.Iterator;
import java.lang.String;
public class List {

	public static void main(String[] args) 
	{
		ArrayList<String> users = new ArrayList<String>();
		users.add("HENRY");	
		users.add("JOHN");	
		users.add("HENRY");	
		users.add("SMITH");	
		users.add("MIKE");	

	for(int index = 0; index<users.size(); index++)
	{
		System.out.println("The elements at " + index + " is " + users.get(index));
	}
	//Enhanced for loop
	for(String us: users)
	{
		System.out.println(us);
	}
	
//	Iterator<String> itr = users.Iterator();
//	while(itr.hasNext())
//	{
//		System.out.println(itr);
//	}
	
	String s1 = new String("John");
	String s2 = s1.concat(" wick");
	System.out.println(s2 + s1);
	}
}
