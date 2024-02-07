import java.io.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException{
		Header();

		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//student.txt"));
		String temp = "";
		int i = 0;
		while((temp = readFile.readLine()) != null) { 
			String[] data = temp.split(" ");//1-5
			double grade = Double.parseDouble(data[4]);

			i++;
			
			System.out.println(i+".\t"+data[0]+"\t"+Level(data[0])+"\t"+data[2].substring(0,1).toUpperCase()+"."+data[3]
					+"\t"+ data[4]+ "\t"+Status(grade));
		}
	}

	public static String Level(String id) {		
		if (Integer.parseInt(id.substring(0,2)) == 18) {
		return "4th";
		}
		else if (Integer.parseInt(id.substring(0,2)) == 19) {
			return "3th";
		}
		else if (Integer.parseInt(id.substring(0,2)) == 20) {
			return "2th";
		}
		else {
			return "1th";
		}		
	}
	
	public static String Status(double grade) {
		if (grade >= 2.0) {
			return "pass";
		}
		
		else if (grade >= 1.0 && grade < 2.0)
		{
			return "Critical";
		}
		else {
			return "Retired";
		}
	}
	public static void Header() {
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("**************************************************************");
	} 
}
