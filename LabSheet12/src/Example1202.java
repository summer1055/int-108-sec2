import java.io.*;
import java.util.*;
public class Example1202 {

	public static void main(String[] args) throws IOException{ // throws in every method that work with file
		//use scanner class to input data from keyboard
		Scanner input = new Scanner(System.in);// how to create input variable
		System.out.println("input Section : ");
		int section = input.nextInt();
		Header();
		showListStudent(section);

	}
	public static void showListStudent(int section) throws IOException{
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String temp = "";
		while((temp = readFile.readLine()) != null) { 
			String[] data = temp.split("\t");//0 2 3 4 5
			int sectionData = Integer.parseInt(data[3]);
			double midterm = Double.parseDouble(data[4]);
			double finalterm = Double.parseDouble(data[5]);
			
			if(sectionData == section) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+midterm+"\t"+ finalterm+"\t"+findResult(midterm,finalterm) );
			}

			
			


			
			
			
			
		}	
		readFile.close();
		

	}
	public static String findResult(double midscore, double finalScore) {
		/*
		if (midscore+finalScore < 40)
		{
			return "Fail";
		}
		else {
		return "Pass";
		}*/
		double totalscore = midscore+finalScore;
		return totalscore<=40?"Fail":"Pass";
		
	}
	public static void Header() {
		System.out.println("************************************************************");
		System.out.println("\t\tList of Data for Section ");
		System.out.println("************************************************************");

	}

}
