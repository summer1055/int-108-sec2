import java.io.*;
import java.util.*;
public class Lab1204 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String temp = "";
		int i = 1;
		int count = 0;
		System.out.print("Enter rating of books: ");
		double rating = input.nextDouble();

		System.out.println("--------------------------------------------------------------------------");

		while((temp = readFile.readLine()) != null) { 
			String[] data = temp.split("\t");//1-6
			double rate = Double.parseDouble(data[2]);	
			if (rate >= rating) {
				count++;
				System.out.println("Book "+i+":"+data[0]+"writed by "+data[1]+"("+data[3]+")"+" reviews");
			}




			i++;
	}
		readFile.close();
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("There are "+count+" book get rating more than "+rating);

	}
}
