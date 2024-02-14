import java.util.*;
import java.io.*;
	public class SaveandOpen extends Employee{
	private String name;
	private String dept;
	
	public void insert() throws IOException{
		//create object to input by keyboard
		Scanner scan = new Scanner(System.in);
		//create object for write (save) data to file using PrintStream Class
		PrintStream writeFile = new PrintStream(new File("d://txtFile//employee.txt"));
		String answer;
		do {
			header();//call header method form employee
			System.out.print("Enter name: ");
			name = scan.next();
			System.out.print("Enter Department: ");
			dept = scan.next();	
			//save all data to file
			writeFile.println(name+"\t"+dept);
			System.out.print("Enter data again ?");
			answer = scan.next().toLowerCase();
			
		}while(answer.equals("y"));

	}
	public void read() {
		int i = 1;
		try {
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check = false;
			header();
			while(readFile.hasNext()) {
				
				name =readFile.next();
				dept =readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
											//getdept from employee
					System.out.println(i+ ") "+ name);
					
					check = true;
					i++;
					
					
				}
			
			}
				if(check == true) {
					header();
					System.out.println("\nEmployee in dept "+super.getDept()+" is "+(i-1) +" person.");
					
				}
				if(check == false) {
					System.out.println("\nSorry, no department "+super.getDept()+" in File");
					
				

				}
				
			
			readFile.close();
			

			


		}
		catch(IOException e) {
			System.out.print("\n Sorry file not found....");
		}
		
	}
		
	
}
