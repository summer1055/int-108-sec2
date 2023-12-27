import javax.swing.*;

public class Lab706 {

	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};
		int indexNumb= Integer.parseInt(JOptionPane.showInputDialog(""
				+ "input Index of array: "));
		
		while(checkIndex(nums,indexNumb)) {
			indexNumb= Integer.parseInt(JOptionPane.showInputDialog(""
					+ "input Index of array again : "));
		}
		int currentvalue = currentdata(nums,indexNumb);
		
		int prevalue = prevdata(nums,indexNumb);
		
		int nextvalue = nextdata(nums,indexNumb);

		if(nextvalue ==0) {
			JOptionPane.showMessageDialog(null, "Current Data,nums["+indexNumb+""
					+ "] is "+currentvalue
					+"\n"+"Previous data,nums["+(indexNumb-1)+"] is "+ prevalue+"\n"
							+ "No next data");
		}

		else if (prevalue==0) {
			JOptionPane.showMessageDialog(null, "Current Data,nums["+indexNumb+""
					+ "] is "+currentvalue
					+"\n"+"No previous data\n"
					+ "Next data,nums["+(indexNumb+1)+"] is "+nextvalue);
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Current Data,nums["+indexNumb+""
					+ "] is "+currentvalue
					+"\n"+"No previous data\n"
					+ "Next data,nums["+(indexNumb+1)+"] is "+nextvalue);
		}
		
	//end of main
	public static boolean checkIndex(int[] number , int index) {
	/*	if ((index>= number.length)||(index<0))
		{
			return true;
		}
		
		else {
			return false;
		}
	}*/
		return ((index>= number.length)||(index<0))? true:false;

	}
	public static int currentdata(int[] nums,int index )
	{
		return nums[index];
	}
	public static int prevdata(int[] nums,int index )
	{
		return (index< 1)? 0:nums[index-1];
/*
		if (index<1) 
		{
			return 0;
		}
		else 
		{ 
			return nums[index-1];
		}*/
	}
	
	public static int nextdata(int[] num,int index ) {
		return (index>=6)? 0:num[index+1];

/*
	if (index>6) 
	{
		return 0;
	}
	else 
	{ 
		return num[index+1];
	}

	}*/
}
}

//indexNumb>= nums.length||indexNumb<0