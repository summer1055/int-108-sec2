import javax.swing.*;//1. libarry
import java.text.*;
public class example4 {

	public static void main(String[] args) {
		// 2. display and input data
		String productName = JOptionPane.showInputDialog("Input product name : ");
		DecimalFormat frm = new DecimalFormat("#,###.00");
		/*String strUnit = JOptionPane.showInputDialog("Input product unit");
		//covert string to int
		int unitPrice = Integer.parseInt(strUnit);*/
		int productunit = Integer.parseInt(
				JOptionPane.showInputDialog("Input product unit"));
		double priductprice = Double.parseDouble(
				JOptionPane.showInputDialog("Input product Price"));
		double totalprice = priductprice*productunit;
		double vat = totalprice+(totalprice*7/100);
		JOptionPane.showMessageDialog(null, "Total Price is "+ 	frm.format(totalprice)+" baht."
				+ "\n Add VAT 7% is "+ frm.format(vat) + " baht.");


	}

}
