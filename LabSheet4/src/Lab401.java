import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y;
		System.out.print("Input value of X : ");
		x = scan.nextInt();
		System.out.print("Input value of Y : ");
		y = scan.nextInt();
		
			while(y<x) {
				System.out.print("Input value of Y, again : ");
				y = scan.nextInt();
			}
			int i;
			for (i=x+1; i<=y; i++)
			{
				System.out.println(x+" + "+i+" = "+(x+=i)); 
			}
		

}
}
