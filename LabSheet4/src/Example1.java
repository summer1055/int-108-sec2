import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int currennum,previouNumber;
		System.out.print("Input number : ");
		previouNumber = scan.nextInt();
		while(true) {
			System.out.print("Input number : ");
			currennum = scan.nextInt();
			if(currennum < previouNumber) {
				System.out.print("Bye Bye");
				break;
			}

		}

		}
	}



