import java.util.*;

public class BookDemo {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Book b1 = new Book();

		
		System.out.print("Input book title : ");
		b1.setTitle(scan.nextLine());
		System.out.print("\nInput book price : ");
		b1.setPrice(scan.nextFloat());
		System.out.print("\nInput publish year : ");
		b1.setpublishyear(scan.nextInt());

		System.out.println(b1);
	}

}
