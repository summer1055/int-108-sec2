import java.util.*;
public class Lab702 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] student = new double[5];
		double all=0;


		for(int i =0; i<student.length;i++)	
		{
			System.out.print("Input score of student " + (i+1)+" : ");
			student[i]= scan.nextDouble();
			all+=student[i];

	}
		double avg =all/5;
		System.out.println("Average of 5 student is "+avg);
		System.out.println("");
		for(int i=0; i<student.length;i++ )
		{
			if (student[i]>avg)
				
			{
				System.out.println("> Student "+(i+1)+"("+student[i]+")");
			}
		}
}
}
