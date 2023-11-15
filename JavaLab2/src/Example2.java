import java.text.*;//1. import library for Format number
public class Example2 {
	
	public static void main(String[] args) {
		//2. define object call DecimalFormat Class
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final int BUFFET = 299;
		int Numberofcustomer = 5;
		float Totalprice = BUFFET*Numberofcustomer;
		System.out.println("Buffet of "+Numberofcustomer+" customers is "
				+frm.format(Totalprice));
		//3. apply object to TotalPrice
		float serviceCharge = Totalprice+(Totalprice*3/100);
		System.out.println("ADD Service Charge 3% is "
				+frm.format(serviceCharge));
	}

}
