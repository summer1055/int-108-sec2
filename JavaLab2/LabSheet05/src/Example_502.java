import javax.swing.*;
public class Example_502 {

	public static void main(String[] args) {
		String yourEmail = JOptionPane.showInputDialog("Input Email");
		while(yourEmail.startsWith("@")||yourEmail.startsWith(" "))
		{
			yourEmail = JOptionPane.showInputDialog("Input your email again");
		}
		yourEmail=yourEmail.toLowerCase();
		if(yourEmail.endsWith("hotmail.com")||yourEmail.endsWith("gmail.com"))
		{
			JOptionPane.showMessageDialog(null, "Your Email is : "+yourEmail);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your Email is not hotmail or gmail.com");
		}
	}

}