package maps;

public class basics 
{
	public long accNo;
	public String name;
	public double bal;
	public String email;
	
	public basics(long accNo, String name, double bal, String email) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.bal = bal;
		this.email = email;
	}
	public basics() {
		super();
	}
	@Override
	public String toString() {
		return "basics [accNo=" + accNo + ", name=" + name + ", bal=" + bal + ", email=" + email + "]";
	}
	
	
	
}
