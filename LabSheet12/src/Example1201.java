import java.util.*;
import java.io.*;
public class Example1201 {

	public static void main(String[] args) throws IOException{
		// use Scanner Class read data from file
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		while(readFile.hasNext()) {
			String fname = readFile.next();		
			String lname = readFile.next();//or readFile.next(when this variable is not using)
			String pass = readFile.next();//or readFile.next (this too)
			String email = readFile.next().toUpperCase();//(. to make first text become Upper)
			
			System.out.println(fname+" "+"("+email+")");
			
			
			}
		readFile.close();
	}

}
