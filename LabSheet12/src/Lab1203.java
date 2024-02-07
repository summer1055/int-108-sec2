import java.io.*;
public class Lab1203 {

	public static void main(String[] args) throws IOException{
	BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
	String temp = "";
	int  round = 0,i=1;
	while((temp = readFile.readLine()) != null) { 
		String[] data = temp.split("\t");
		System.out.println(i+"."+data[0]+"("+data[1]+"), Rating  "+data[2] +" publish on "+ data[5]);
	
		round++;
		i++;
		
	 }
	readFile.close();
	System.out.println("============================================");
	System.out.println("Total number of book : "+ round);
	}


}
