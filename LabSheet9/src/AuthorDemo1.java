import java.util.*;

public class AuthorDemo1 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String email;
		String name = null;
		char gender;
		System.out.print("Input author name : ");
		name=(scan.nextLine());
		System.out.print("Input author e-mail : ");
		email=(scan.nextLine());
		System.out.print("Input author gender : ");
		gender=(scan.next().charAt(0));

		Author a1 = new Author(name,email,gender);
		System.out.print(a1);
	}

}
