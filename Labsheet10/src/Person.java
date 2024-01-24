
public class Person {
	//declare 2 private attributes
	private String firstName;
	private String lastName;
	
	public Person()
	{
		firstName = "";
		lastName = "";
	}
	public Person(String first, String last) {
		firstName= first;
		lastName= last;
	//	setName(first,last);
	}
	public void setName(String first, String last) {
		
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;

	}
	public String toString() {
		return firstName+" "+lastName;
	}
}
