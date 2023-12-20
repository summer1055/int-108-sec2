import javax.swing.*;
public class LabSheet601 {

	public static void main(String[] args) {
		inputemail();
		}
	public static void inputemail() {
		String inputemail = JOptionPane.showInputDialog("Input your Email: ").toLowerCase();
		boolean ckEmail = checkEmail(inputemail);
		displayEmail(ckEmail,inputemail);
	}
	
	public static boolean checkEmail(String email) {
	//	if (email.startsWith("@")||  );
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			return true;
		}
		else {
			return false;
		}		
	}
	public static void displayEmail(boolean chEmail,String inEmail) {
		if(chEmail == true) {
			JOptionPane.showMessageDialog(null, "Your email is "+ inEmail);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your email is not hotmail or gmail");
		}
	}
}