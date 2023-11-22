import javax.swing.*;
public class Example3 {

	public static void main(String[] args) {
		double weight = Double.parseDouble(
				JOptionPane.showInputDialog("Input Weight :"));
		double height = Double.parseDouble(
				JOptionPane.showInputDialog("Input height :"));
		height /= 100;
		double bmi = weight /(height*height);
		String bmiCategory;
		if (bmi < 18 )
		{		bmiCategory="Underweight";	
}
		else if (bmi < 25)
		{		bmiCategory="Normalweight";	
		}
		else if (bmi < 30)
		{		bmiCategory="Overweight";
		}
		else 
		{		bmiCategory="Obesity";
		
		}
		JOptionPane.showMessageDialog(null, "bmi = "+ String.format("%.1f",bmi)+ "\nyou are "+bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);
				

	}

}
