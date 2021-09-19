package serialize;

import java.io.Serializable;

public class Employee implements Serializable   // empty or marker interface - no abstract methods are present
{
	private static final long serialVersionUID = 1L;// unique serial no. - needed to identify and deserialize a serializable object
	private int id;
	private String name;
	private double sal;
	private String email;
	
	public Employee(int id, String name, double sal, String email) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.email = email;
	}

	public Employee() {
		super();
	}
	
//	getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", sal=" + sal + ", email=" + email + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
