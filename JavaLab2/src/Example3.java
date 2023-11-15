import java.util.*;//1. library
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");

		//2. define object for scanner class
		Scanner input = new Scanner(System.in);
		//3. input data
		System.out.print("Input Product name : ");
		String productName = input.nextLine();
		System.out.print("Input Product Unit : ");
		float productUnit = input.nextInt();
		System.out.print("Input Product Price per unit : ");
		float pricePerUnit = input.nextFloat();
		System.out.println();
		float totalprice = pricePerUnit*productUnit;
		System.out.println("Total Price is "+ frm.format(totalprice)+" baht.");
		float vat = totalprice+(totalprice*7/100);
		System.out.println("Add VAT 7% is "+frm.format(vat)+" baht.");
	}

}
