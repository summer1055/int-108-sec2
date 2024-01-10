import java.util.*;
public class TestPiggyBank {
	static PiggyBank pb = new PiggyBank();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
	/*	PiggyBank pb = new PiggyBank();
		pb.setPeggyBank(500);
		System.out.println("Money Total : "+ pb.getTotal());
		pb.addTwo(34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " +pb.getTotal());
		pb.addTen(13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addFive(100);*/
		inputCoin();
	}
	public static void inputCoin(){
		System.out.println("Money Total : "+ pb.getTotal());
		System.out.print("Please define size of PiggyBank : ");
		int sizeofPiggybank = scan.nextInt();
		pb.setPeggyBank(sizeofPiggybank);
		System.out.println("Size of your Piggy Bank : "+ pb.getPiggyBank());
		MainMenu();
		System.out.println();
		System.out.println();

	}
	public static void MainMenu() {
		while(true){
		System.out.println("===========================");
		System.out.println("Menu of PiggyBank");
		System.out.println("===========================");
		System.out.println("[1] one baht.");
		System.out.println("[2] two baht.");
		System.out.println("[3] five baht.");
		System.out.println("[4] ten baht.");
		System.out.println("[5] Exit");
		System.out.println("===========================");
		System.out.println("Please Select Menu[1-5]");
		int select = scan.nextInt();
		if (select==1) {
			System.out.println("Insert 1 Baht Money :" );
			int m = scan.nextInt();
			pb.addOne(m);
			System.out.println(" Money Total : "+pb.getTotal());
		}
		else if (select==2) {
			System.out.println("Insert 2 Baht Money :" );
			int m = scan.nextInt();
			pb.addTwo(m);
			System.out.println(" Money Total : "+pb.getTotal());
		}
		else if (select==3) {
			System.out.println("Insert 5 Baht Money :" );
			int m = scan.nextInt();
			pb.addFive(m);
			System.out.println(" Money Total : "+pb.getTotal());
		}
		else if (select==4) {
			System.out.println("Insert 10 Baht Money :" );
			int m = scan.nextInt();
			pb.addTen(m);
			System.out.println(" Money Total : "+pb.getTotal());
		}
		else if(select == 5) {
			System.out.println("Bye Bye");
			break;

		}
		
	}
		

		
}
	
}
