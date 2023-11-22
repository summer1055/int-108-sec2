import javax.swing.*;
import java.util.Random;
public class Withdrawal {

	public static void main(String[] args) {
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9) * 100000;
		//JOptionPane.showMessageDialog(null, "Your Balance: "+balance);
		int withdraw = Integer.parseInt(
		JOptionPane.showInputDialog (null, "your balance : "+ balance + "\nInput money to withdraw "));
		if (withdraw > balance)
		{
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than the balance","Error",JOptionPane.ERROR_MESSAGE);
		}
		else if (withdraw > 20000)
		{
			
				JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20000","Error",JOptionPane.ERROR_MESSAGE);
			
		}
		else if (withdraw %100 >0)
		{		JOptionPane.showMessageDialog(null, "Error: Cannot withdraw "+withdraw+" bath.","Error",JOptionPane.ERROR_MESSAGE);
		}
		else 
		{	JOptionPane.showMessageDialog(null, "Your withdraw "+withdraw+" bath."+"\n1,000 = "+withdraw/1000+"\n500 = "+(withdraw%1000) /500 +"\n100 = "+ withdraw%1000%500/100);
		}

	}

}
