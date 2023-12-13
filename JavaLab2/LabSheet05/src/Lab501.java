import java.util.*;

public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.print("Full name : ");
		name = scan.nextLine();
		String firstname ;
		String lastname ;
		int check = name.indexOf(" "); 
		
		if(check ==-1 )
			{
			System.out.println("Incorrect Name");
			}
		else {
			firstname=name.substring(0,check);
			lastname=name.substring(check+1,name.length());
			System.out.println("First Name: "+firstname);
			System.out.println("Last Name: "+lastname);

		}
			
		
		



		

}
}
