import java.util.*;
import java.io.*;
public class Employeeinfo {

	public static void main(String[] args) throws IOException{
		//create object to input by keyboard
		Scanner scan = new Scanner(System.in);
		String choice,department;
		System.out.print("Insert or Read data? :");
		choice = scan.next().toLowerCase();
		while(!(choice.equals("insert"))  && !(choice.equals("read"))) 
		{
			//if it not = "insert"
			System.out.print("Please type insert or read data,again");
			choice = scan.next().toLowerCase();
			
		}
		//create object to call all method in Class SaveandOpen
		SaveandOpen obj = new SaveandOpen();
		// obj can use every method in SaveandOpen that is public
		if(choice.equals("insert")) {
			obj.insert(); // call insert method from SaveandOpen
			
			
		}
		else if (choice.equals("read")) {
			System.out.print("\nEnter department: ");
			department = scan.next();
			obj.setdept(department); // sent department to method setdept in class employee
			obj.read(); // call read method from class SaveandOpen
		}
		
	}

}
