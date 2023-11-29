import java.util.*;
public class JavaClassPensionContributionCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int SALARY_CEILING = 6000;
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		
		int salary, age;
		System.out.print("Enter the monthly salary : $");
		salary = scan.nextInt();
		System.out.print("Enter the age : ");
		age = scan.nextInt();
		int ContributionSalary = Math.min(salary, SALARY_CEILING);
		double employeeContribution = 0,employerContribution = 0,totalContributionSalary=0;

		
		if(age <= 55) {
			employeeContribution=ContributionSalary * EMPLOYEE_RATE_55_AND_BELOW ;
			employerContribution=ContributionSalary*EMPLOYER_RATE_55_AND_BELOW;
			}
		else if (age <=60) {
			employeeContribution=ContributionSalary * EMPLOYEE_RATE_55_TO_60 ;
			employerContribution=ContributionSalary*EMPLOYER_RATE_55_TO_60;
		}
		else if (age <=65) {
			employeeContribution=ContributionSalary * EMPLOYEE_RATE_60_TO_65 ;
			employerContribution=ContributionSalary*EMPLOYER_RATE_60_TO_65;
		}
		else if (age >=65) {
			employeeContribution=ContributionSalary * EMPLOYEE_RATE_65_ABOVE ;
			employerContribution=ContributionSalary*EMPLOYER_RATE_65_ABOVE;
		}
		System.out.printf("The employee's contribution is : $%.2f\n",employeeContribution);
		System.out.printf("The employer's contribution is : $%.2f\n",employerContribution);
		totalContributionSalary =employeeContribution+employerContribution;
		System.out.printf("The total contribution is : $%.2f",totalContributionSalary);


	}

}
