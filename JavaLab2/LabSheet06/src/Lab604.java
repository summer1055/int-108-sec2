import java.util.*;
public class Lab604 {
	static Scanner scan = new Scanner(System.in);
	static String studentID,strSubjectID;
	static int subJectID;
	
	public static void main(String[] args) {
		inputStudent();
		
	}
	
	public static void inputStudent() {
		do{
			System.out.print("Enter Student ID: ");
			studentID = scan.next();
			System.out.print("Enter Subject ID: ");
			subJectID = scan.nextInt();
			//how to convert integer to string
			strSubjectID = subJectID+"";
		}while(!(isLength(studentID,strSubjectID)));
		System.out.println();
		displayData(isITStudent(studentID),isITStudent(strSubjectID));
	}
	
	public static boolean isLength(String id,String sub_id) {
		if(id.length()==10 && sub_id.length()==7) {
			return true;
		}
		{
		return false;
		}
	}
	public static boolean isITStudent(String id) {
		if(id.substring(0,3).equals("211")&&id.substring(3,6).equals("311"))
		{
		return true;	
		}
		else {
			return false;
		}
	
	}
	public static boolean isITSubject(String sub_id) {
		if(sub_id.substring(0,2).equals("21")&&sub_id.substring(4,5).equals("1"))
		{
		return true;	
		}
		else {
			return false;
		}
	}
	public static void displayData(boolean sid, boolean subid) {
		if (sid== true) {
			System.out.println("Student id:"+ studentID +" 1st year student in IT");
		}
		else {
			System.out.println("Student id:"+ studentID +" is not 1st year student in IT");
			
		}
		if (subid== true) {
			System.out.println("Endroll in courses for Year 1");
		}
		else {
			System.out.println("Not Endroll in courses for Year 1");
			
		}
	}
}
