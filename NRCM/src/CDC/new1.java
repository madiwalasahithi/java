package CDC;

public class new1 {
	private String firstName;
	private String lastName;
	
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
		
	}
	public static void main(String[] args) { 
		new1 d1=new new1();
		d1.setFirstName("vikram");
		d1.setLastName("rathod");
		System.out.println(d1.getFirstName());
		
		System.out.println(d1.getLastName());  

		
	}
}
