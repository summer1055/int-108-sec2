
public class Author {
	private String name = "";
	private String email = "";
	private char gender = ' ';
	public static final String DEFAULT_NAME = "null";
	public static final String DEFAULT_EMAIL = "null";
	public static final char DEFAULT_GENDER = 'n';

	
	public Author(String name,String email,char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public Author(String name,String email) {
		this.name=name;
		this.email=email;
		gender=DEFAULT_GENDER;
	}
	public Author() {
		name=DEFAULT_NAME;
		email=DEFAULT_EMAIL;
		gender=DEFAULT_GENDER;
	}
	public String getName() {
		return name;
		
	}
	public String getEmial() {
		return email;
	}
	public String getGender() {
		if(gender == 'm'||gender == 'M')
		{
			return "Male";
		}
		else if (gender == 'F'||gender == 'f') {
		return "Female";
	}
		else {
			return null;
	}
	}
	public String toString() {
		return "Author name : "+name+"("+email+";"+getGender()+")";
	}
}
