import javax.swing.*;
import java.text.*;
public class Example1 {

	public static void main(String[] args) {	
		final int BUFFET = 299;
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many of customer"));
		double  totalprice=0 , priceafter =0;
		
		totalprice= BUFFET*numberofCustomer;
		
		JOptionPane.showConfirmDialog(null, "Amount to be Paid is "+  String.format("%.2f",totalprice) + " baht. ");
		int membercard;
		do {
		membercard = JOptionPane.showConfirmDialog(null, "Total Price is "+  String.format("%.2f",totalprice) +" baht."
			+"\nDo you have a Member card ?");
		}while ((membercard == JOptionPane.CANCEL_OPTION));
		if (membercard == JOptionPane.YES_OPTION) {
			priceafter = totalprice *90/100;
			JOptionPane.showConfirmDialog(null, "Amount to be paid is " +  String.format("%.2f",priceafter) +" baht.");
			
			}
		else if (membercard == JOptionPane.NO_OPTION)  {
			JOptionPane.showConfirmDialog(null, "Amount to be paid is " +  String.format("%.2f",totalprice +" baht."));
		}
		
		
	}

}
