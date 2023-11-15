
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Bookisbn = "IB2-6325-85-4-1";
		String Booktitle = "Basic Java Programming";
		int BookUnit = 5;
		//float BookPrice = 225.75f;
		double BookPrice = 225.75;
		// display to console
		
		System.out.println("Book ISPN : "+Bookisbn);
		System.out.println("Book Title : "+Booktitle);
		System.out.println("Book Unit : "+BookUnit+" Books.	");
		System.out.println("Book Price : "+BookPrice+"Baht.");
		System.out.println("-------------------------------");
		System.out.println("Total Price is "+BookPrice*BookUnit);
		double Totalprice = BookUnit*BookPrice;
		double vat = Totalprice+(Totalprice*7/100);
		System.out.println("Add VAT 7% is "+vat);
	}

}
