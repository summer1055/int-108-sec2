import java.io.*;
import java.util.*;
public class AddProduct {

	public static void main(String[] args) throws IOException {
		//create object for write (save) data to file using PrintWriter Class
		PrintWriter writeFile = new PrintWriter(new FileWriter("d://txtFile//product.txt", true));
		//create object to input by keyboard
		Scanner scan = new Scanner(System.in);
		//Display and input data from keyboard
		System.out.print("Input product id :");
		String productid = scan.next();
		System.out.print("Input product name :");
		String productname = scan.next();
		System.out.print("Input product Unit :");
		int productUnits = scan.nextInt();
		System.out.print("Input product Price :");
		double productPrice = scan.nextDouble();
		//save data to file
		writeFile.println(productid+","+productname+","+productUnits+","+productPrice);
		
		
		System.out.println("Save File already");
		
		writeFile.close();
	}

}
