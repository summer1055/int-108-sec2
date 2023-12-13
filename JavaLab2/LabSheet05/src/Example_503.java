import java.util.*;
import javax.swing.*;

public class Example_503 {

	public static void main(String[] args) {

		String sentence=JOptionPane.showInputDialog("Input the sentence : ");


		
		while(!sentence.endsWith(".")) 
		{

		sentence = JOptionPane.showInputDialog("Input your sentence again");
		}
		int countSpace=0;
		for(int i=0; i<sentence.length()-1; i++)
		{
			if(sentence.charAt(i)==' ') 
			{
				countSpace+=1;
			}
		}
		System.out.println();
		JOptionPane.showMessageDialog(null, "This sentence has "+countSpace+" space."+"\nThis sentence has "+(countSpace+1)+" word.");




	}

}
