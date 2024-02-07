import java.io.*;
import java.util.*;
public class Lab1202 {

	public static void main(String[] args) throws IOException{
	Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
	Scanner input = new Scanner(System.in);
	System.out.print("input Email : ");
	String check = input.next();

	while(readFile.hasNext()) {
		String fname = readFile.next();		
		String lname = readFile.next();		
		String pass = readFile.next();	
		String email = readFile.next();		
		if(check.equalsIgnoreCase(email)) {// use to check string with string and dont care about text lower/upper case
			System.out.println("Your password is "+ pass);
			break;
		}
		else {
			System.out.println("The data not found...");
			break;
		}
		
	}
	readFile.close();

	}
}
