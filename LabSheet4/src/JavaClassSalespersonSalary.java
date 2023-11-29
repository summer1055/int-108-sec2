import java.util.*;
import java.text.*;
public class JavaClassSalespersonSalary {

	public static void main(String[] args) {
		DecimalFormat frmId = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);

		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;
		int sales;
		double salary;

		while(true) {
			System.out.print("Enter sales in dollars (or -1 to end): ");
			sales = scan.nextInt();

			
			if(sales == SENTINEL) {
				System.out.printf("bye");
				break;
				
			}
			salary= sales*COMMISSION_RATE+1000;
			System.out.println("Salary is : "+frmId.format(salary));

			
		}
       System.out.println();
	}

}
