import java.util.*;
public class Lab603 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter Name : ");
		String fullname = scan.nextLine();
		String firstname=fullname.substring(0,fullname.indexOf(' '));
		System.out.print(abbreviatName(fullname)+firstname);
	}
	
	public static String abbreviatName(String name) {
		String test = " " ;
		for( int i = 0; i<name.length(); i++)
	{
	 if(name.charAt(i)== ' ') 
	 	{
		 test=test+name.charAt(i+1)+".";
	 	}
 
	}

	 return test;
	}

}